public static String guessWord(int n, String[] arr) {
      int len = 0;
      String result;
      ArrayList<String> oddLength = new ArrayList<String>();
      for (int i = 0; i < n; i++) { 
        len = arr[i].length(); 
        if (len % 2 == 1) 
          oddLength.add(arr[i]); 
      } 
      if (oddLength.size() == 0) 
        result = "Better luck next time"; 
      else { 
        Iterator itr = oddLength.iterator(); 
        int max = -1; 
        String res = ""; 
        while (itr.hasNext()) { 
          String temp = (String) itr.next(); 
          if (temp.length() > max) {
                  res = temp;
                  max = temp.length();
          }
        }
        result = res;
      }
      return result;
}
