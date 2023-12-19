public static boolean pairSumBST(TreeNode root, int k) {
  if(root==null)
    return false;
  List<Integer> result = new ArrayList<>();
  inorder(root, result);
  int i=0;
  int j = result.size() - 1;
  while(i<j) {
    if(result.get(i) + result.get(j) < k) {
      i++;
    }
    else if(result.get(i) + result.get(j) > k) {
      j--;
    }
    else if(result.get(i) + result.get(j) == k) {
      return true;
    }
  }
  return false;
}

private static void inorder(TreeNode root, List<Integer> result) {
  if(root == null) {
    return;
  }
  inorder(root.left, result);
  result.add(root.data);
  inorder(root.right, result);
}
