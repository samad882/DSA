class Solution {
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
                second = root; // Handle adjacent swapped nodes
            } else {
                second = root; // Handle non-adjacent swapped nodes
            }
        }
        prev = root;

        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        inorder(root);
        
        // Swap the values of the two incorrectly placed nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}