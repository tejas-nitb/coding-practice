public static char getMinimumFrequentCharacter(String str) {
  char arr[] = str.toCharArray();
  int temp[] = new int[256];
  for (int i = 0; i < arr.length; i++) { 
    temp[arr[i]]++; 
  } 
  int minimum = Integer.MAX_VALUE; 
  int index = 0; 
  for (int i = 255; i >= 0; i--) {
      if (temp[i] == 0)
          continue;
      minimum = Math.min(minimum, temp[i]);
  }
  for (int i = 0; i < arr.length; i++) {
      if (minimum == temp[arr[i]]) {
          return arr[i];
      }
  }
  return '0';
}
