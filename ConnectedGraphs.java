public static void checkConnectedType(int graph[][], int n) {
  boolean strong = true;
  for(int i=0; i<n;i++) {
    for(int j=0;j<n;j++) {
      if(graph[i][j] != graph[j][i]) {
        strong = false;
        break;
      }
    }
    if(!strong)
      break;
  }
  if(strong)
    System.out.println("Strongly connected");

boolean upperTriangle = true;
  for(int i=0; i<n ;i++) {
    for(int j=0; j<n ;j++) {
      if(i>j && graph[i][j] == 0) {
        upperTriangle = false;
        break;
      }
    }
    if(!upperTriangle) 
      break;
  }
  if(upperTriangle)
    System.out.println("Unilaterally connected");

boolean lowerTriangle = true;
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++) {
      if(i<j && graph[i][j] == 0) {
        lowerTriangle = false;
        break;
      }
    }
    if(!lowerTriangle)
      break;
  }
  if(lowerTriangle)
    System.out.println("Unilaterally connected");
  else
    System.out.println("Weakly connected");

}
