package org.example;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        //create a new 2d array to keep track of the width of different squares
        int[][] result = new int[matrix.length + 1][matrix[0].length + 1];
        int side = 0;
        //iterate through the given array
        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[0].length; j++) {
                //check if the top left of the square is a '1'
                if (matrix[i - 1][j - 1] == '1') {
                    //find the minimum width of the square in the 2x2 matrix
                    result[i][j] = 1 + Math.min(result[i - 1][j - 1], Math.min(result[i][j - 1], result[i - 1][j]));
                    //update the side
                    side = Math.max(side, result[i][j]);
                }
            }
        }
        //return the area
        return side * side;
    }
}
