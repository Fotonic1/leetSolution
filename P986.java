import java.util.ArrayList;
import java.util.List;

public class P986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;

        while (i2 < secondList.length && i1 < firstList.length) {
            int a = Math.max(secondList[i2][0], firstList[i1][0]);
            int b = Math.min(secondList[i2][1], firstList[i1][1]);
            if (a >= firstList[i1][0] && b <= firstList[i1][1]) {
                res.add(new int[]{a,b});
            }

            if (secondList[i2][1]>firstList[i1][1]) {
                i1++;
            } else i2++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
