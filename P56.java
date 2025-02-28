import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] c = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (c[1] >= intervals[i][0] && c[1] < intervals[i][1]) {
                c[1] = intervals[i][1];
            } else if (c[1] < intervals[i][0]){
                res.add(c);
                c = intervals[i];
            }
        }

        res.add(c);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        P56 t = new P56();
        int[][] m = {{1,3}, {2,6}, {8,10}, {15,16}};
        System.out.println(Arrays.deepToString(t.merge(m)));
    }
}
