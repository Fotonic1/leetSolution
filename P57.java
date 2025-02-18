import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        boolean add = true;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                    res.add(intervals[i]);
            } else if (intervals[i][0] > newInterval[1]) {
                if (add) {
                    add = false;
                    res.add(newInterval);
                }
                res.add(intervals[i]);
            } else {
                add = false;
                res.add(newInterval);
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                    newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
                }
                i--;
            }
        }

        if (add) {
            res.add(newInterval);
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{new int[]{1,3}, new int[]{6,9}}, new int[]{0, 0})));
    }

}
