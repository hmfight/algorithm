package wj;

/**
 * Created by wangjia .
 * Date:2015/10/13 0013
 * Time:21:24
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //先考虑边界情况
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length, column = matrix[0].length;
        int start = 0, end = row * column - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int number = matrix[mid / column][mid % column];
            if (number == target) {
                return true;
            } else if (number < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
