package org.example;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] result = new int[matrix.length + 1][matrix[0].length + 1];
        int side = 0;
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    result[i][j] = 1 + Math.min(result[i - 1][j - 1], Math.min(result[i - 1][j], result[i][j - 1]));
                    side = Math.max(side, result[i][j]);
                }
            }
        }
        return side * side;
    }
}
