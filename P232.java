import java.util.Stack;

public class P232 {

    Stack<Integer> s1, s2;

    public P232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        restock();
        return s2.pop();
    }

    public int peek() {
        restock();
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    private void restock() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(hasCycle());
    }
}
