public static void findValidArrangement(int M, int N) {
  if(N==1) {
    for(int i=1; i<=M; i++) {
      System.out.println(i);
    }
    return;
  }
  if(M%2==1) {
    System.out.println(-1);
    return;
  } else {
    for(int i=1; i <= M; i++) {
      int num = i;
      for(int j=1; j <= N; j++) {
        System.out.print(num + " ");
        num += M;
      }
      System.out.println();
    }
    return;
  }
}
  
    
