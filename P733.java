import java.util.Arrays;

public class P733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color) return image;
        fill(image, sr, sc, oldColor, color);
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (sr < 0 || sc < 0 || image.length <= sr || image[sr].length <= sc) return;
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            fill(image, sr + 1, sc, oldColor, newColor);
            fill(image, sr - 1, sc, oldColor, newColor);
            fill(image, sr, sc + 1, oldColor, newColor);
            fill(image, sr, sc - 1, oldColor, newColor);
        }
    }

    public static void main(String[] args) {
        System.out.println((floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2)));
    }
}
