import java.util.*;

public class P1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < reservedSeats.length; i++) {
            if (!map.containsKey(reservedSeats[i][0])) {
                map.put(reservedSeats[i][0], new HashSet<>());
            }
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }
        int res = 2 * (n - map.size());
        for (Set<Integer> reserve : map.values()) {

            int curRes = 0;

            if (!reserve.contains(2) && !reserve.contains(3) && !reserve.contains(4) && !reserve.contains(5)) curRes++;

            if (!reserve.contains(9) && !reserve.contains(8) && !reserve.contains(7) && !reserve.contains(6)) curRes++;

            if (curRes == 0 && !reserve.contains(4) && !reserve.contains(5) && !reserve.contains(6) && !reserve.contains(7)) curRes++;

            res += curRes;

        }

        return res;
    }

    public static void main(String[] args) {
        P1386 t = new P1386();
        System.out.println(t.maxNumberOfFamilies(2, new int[][]{{2,1},{1,8},{2,6}}));
    }
}
