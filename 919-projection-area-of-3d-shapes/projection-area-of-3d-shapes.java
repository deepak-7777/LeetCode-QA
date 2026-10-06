class Solution {
    public int projectionArea(int[][] grid) {
       int area = 0;
       
        for (int i = 0; i < grid.length; i++) {
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < grid.length; j++) {
                // Top view
                if (grid[i][j] > 0) {
                    area++;
                }
                // Maximum height in current row
                rowMax = Math.max(rowMax, grid[i][j]);

                // Maximum height in current column
                colMax = Math.max(colMax, grid[j][i]);
            }
            area += rowMax;
            area += colMax;
        }
        return area;
    }
}