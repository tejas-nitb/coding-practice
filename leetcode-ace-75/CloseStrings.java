public boolean closeStrings(String word1, String word2) {
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];
        for(char c : word1.toCharArray()) {
            frequency1[c-'a']++;
        }
        for(char c : word2.toCharArray()) {
            frequency2[c-'a']++;
        }
        for(int i = 0; i < 26 ; i++) {
            if((frequency1[i] == 0 && frequency2[i] != 0) || (frequency1[i] != 0 && frequency2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);
        for(int i = 0; i < 26 ; i++) {
            if(frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
}
