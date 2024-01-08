public static int[] sortColors (int[] colors) {
        int red = 0;
        int white = 0;
        int blue = colors.length - 1;
        int temp = colors[0];
        for (int i = 0; i < colors.length ; i++) {
            if(colors[white] == 0) {
                temp = colors[white];
                colors[white] = colors[red];
                colors[red] = temp;
                white++;
                red++;
            } else if(colors[white] == 1) {
                white++;
            } else {
                temp = colors[white];
                colors[white] = colors[blue];
                colors[blue] = temp;
                blue--;
            }
        }
        return colors;
}
