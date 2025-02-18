public class P104 {
    public int maxDepth(TreeNode root) {
        return length(root);
    }

    public int length(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(length(node.left), length(node.right));
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
