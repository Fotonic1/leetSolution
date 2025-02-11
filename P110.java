public class P110 {
    public static boolean isBalanced(TreeNode root) {
        return heightOfTree(root) > -1;
    }

    public static int heightOfTree(TreeNode root){
        if(root == null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        if(leftHeight == -1 ||
                rightHeight == -1 ||
                Math.abs(leftHeight-rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight,rightHeight);
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
