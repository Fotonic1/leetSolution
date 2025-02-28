import java.util.ArrayList;
import java.util.List;

public class P102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        addLevels(result, root, 0);

        return result;
    }

    public static void addLevels(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (result.size() - 1 < level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        addLevels(result, node.left, level+1);
        addLevels(result, node.right, level+1);
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
