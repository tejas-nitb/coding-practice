public static boolean isSameTree(TreeNode p, TreeNode q) {
  if(p == null && q == null) {
    return true;
  }
  if(p == null || q == null || p.value != q.value) {
    return false;
  }
  return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
