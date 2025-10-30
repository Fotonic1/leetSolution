import java.util.ArrayList;
import java.util.List;

public class P113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                res.add(new ArrayList<>(List.of(root.val)));
            }
        } else {
            res.addAll(pathSum(root.left, targetSum - root.val));
            res.addAll(pathSum(root.right, targetSum - root.val));
            res.forEach(r -> r.addFirst(root.val));
        }

        return res;
    }
}
