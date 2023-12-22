public static int solve(int types, int amount, String varieties, int[] price) {
    int[] frequency = new int[26];
    char[] variety = varieties.toCharArray();
    int temp = 0, answer = 0, maxFrequency = 0, start = 0;
    for (int i = 0; i < types; i++) { 
      int index = variety[i] - 'a'; 
      frequency[index] += price[index]; 
      temp += price[index]; 
      maxFrequency = Math.max(maxFrequency, frequency[index]); 
      if (temp - maxFrequency > amount) {
          while (temp > amount) {
              boolean flag = false;
              int tempIndx = variety[start] - 'a';
              if (maxFrequency == frequency[tempIndx]) {
                  flag = true;
              }
              temp -= price[tempIndx];
              frequency[tempIndx] -= price[tempIndx];
              start++;
              if (flag) {
                  maxFrequency = 0;
                  for (int j = 0; j < 26; j++) {
                      maxFrequency = Math.max(frequency[j], maxFrequency);
                  }
              }
              if (temp - maxFrequency < amount) {
                  break;
              }
          }
      }
      answer = Math.max(answer, i - start + 1);
    }
    return answer;
}
