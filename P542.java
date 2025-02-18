import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int max = m+n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) continue;
                int top = max, left = max;
                if (i > 0) top = mat[i - 1][j];
                if (j > 0) left = mat[i][j - 1];
                mat[i][j] = Math.min(top, left) + 1;
            }
        }

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                int bottom = max, right = max;
                if (i < m - 1) bottom = mat[i + 1][j];
                if (j < n - 1) right = mat[i][j + 1];
                mat[i][j] = Math.min(mat[i][j] , Math.min(bottom, right) + 1);
            }
        }

        return mat;
    }

    public static void main(String[] args) {
    }

}
