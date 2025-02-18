public class P543 {
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return result;
    }

    int result = 0;

    public int length(TreeNode root) {
        if (root == null) return 0;
        int left = length(root.left);
        int right = length(root.right);
        result = Math.max(result, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
