public static boolean isDuplicate(int[] numbers) {
    for (int index = 0; index < numbers.length; index++) {
        int absIndex = Math.abs(numbers[index]);
        if (numbers[absIndex] < 0) {
            return true;
        } else {
            numbers[absIndex] = -numbers[absIndex];
        }
    }
    return false;
}
