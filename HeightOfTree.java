public static int heightOfBinaryTree(TreeNode root) {
      if(root == null) {
          return 0;
      } else {
          int lDepth = heightOfBinaryTree(root.left);
          int rDepth = heightOfBinaryTree(root.right);
          if(lDepth > rDepth) {
              return lDepth + 1;
          } else {
              return rDepth + 1;
          }
      }
}
