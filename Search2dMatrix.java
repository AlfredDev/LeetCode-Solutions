
public class Search2dMatrix
{
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix[0].length-1;
        
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                while (left <= right) {
                    int mid = right + (left - right) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    }

                    if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        
        return false;
    }
}

