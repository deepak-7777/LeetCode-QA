class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {   // reshape possible hai ki nahi 
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];    // New matrix me same order me daalo
        }
        return result;
    }
}