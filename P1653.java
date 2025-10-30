import java.util.Stack;

public class P1653 {
    public int minimumDeletions(String s) {
        int result = 0, bCount = 0;
        for (char c: s.toCharArray()) {
            if (c == 'b' ){
                bCount++;
            } else {
                result = Math.min(result + 1, bCount);
            }
        }
        return result;
    }
}
