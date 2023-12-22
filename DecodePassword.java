public static String decodePassword(String str) {
  char arr[] = str.toCharArray();
  String current = "";
  String result = "";  
  for(int i=arr.length-1; i>0 ; i=i-2) {
      current = "";
      current = "" + arr[i] + arr[i-1];
      int n = Integer.parseInt(current); 
      if(n == 32)
          result += " ";
      else if((n>=65 && n<=90 ) || (n>=97 && n<=99))
          result += (char)n;
      else {
          if(i-2<0)
            break;
          current += arr[i-2];
          n = Integer.parseInt(current);
          result += (char)n;
          i--;
      }
  }
  return result;
}
