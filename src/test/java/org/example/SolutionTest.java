package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalSquareTest() {
        Solution solution = new Solution();
        char[][] input = new char[][] {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        assertEquals(4, solution.maximalSquare(input));

        char[][] inputTwo = new char[][] {
                {'0', '1'},
                {'1', '0'}
        };
        assertEquals(1, solution.maximalSquare(inputTwo));

        char[][] inputThree = new char[][] {
                {'0'}
        };
        assertEquals(0, solution.maximalSquare(inputThree));
    }
}