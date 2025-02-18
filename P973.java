import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P973 {
    public int[][] kClosest(int[][] points, int k) {
        List<int[]> res = new ArrayList<>();
        int[] sqrt = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            sqrt[i] = points[i][0]*points[i][0] + points[i][1]*points[i][1];
        }
        int target = Arrays.stream(sqrt).sorted().distinct().limit(k).max().orElse(0);

        for (int i = 0; i < sqrt.length; i++) {
            if (sqrt[i] <= target && k-->0) res.add(points[i]);
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
    }

}
