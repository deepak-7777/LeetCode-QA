class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            // Row ka minimum element aur uska column index
            int minVal = matrix[i][0];
            int col = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    col = j;
                }
            }

            // Check karo ki kya ye apni column ka maximum hai
            boolean isLucky = true;

            for (int k = 0; k < m; k++) {
                if (matrix[k][col] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                ans.add(minVal);
            }
        }
        return ans;
    }
}