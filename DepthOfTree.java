class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left); // 1
        int right = maxDepth(root.right);  // 2
        return Math.max(left, right) + 1;  //2 + 1 = 3
    }
}
