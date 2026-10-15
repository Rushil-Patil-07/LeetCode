class Solution {
    public int[] findDegrees(int[][] matrix) {
        int sum = 0;
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }
}