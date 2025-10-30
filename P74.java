public class P74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        while (l <= r){
            int mid = l + (r - l)/2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length-1]) {
                int n = mid;
                l = 0;
                r = matrix[n].length - 1;
                while (l <= r){
                    mid = l + (r - l)/2;
                    if (target == matrix[n][mid]) {
                        return true;
                    } else if(target < matrix[n][mid]) {
                        r = mid - 1;
                    } else l = mid + 1;
                }
            } else if(target < matrix[mid][0]) {
                r = mid -1;
            } else l = mid + 1;
        }

        return false;
    }
}
