import java.util.*;

public class P133 {

    public static Map<Integer, Node> nodes = new HashMap<>();

    public static Node cloneGraph(Node node) {
        if (node == null) {
           return null;
        }
        Node result = new Node(node.val);
        nodes.putIfAbsent(node.val, result);
        for (Node neighbor : node.neighbors) {
            if (nodes.containsKey(neighbor.val)) {
                result.neighbors.add(nodes.get(neighbor.val));
            } else {
                result.neighbors.add(cloneGraph(neighbor));
            }
        }
        return result;
    }


    public static void main(String[] args) {
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
