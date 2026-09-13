class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;      
        int m = nums[0].length;   

      for (int i = 0; i < n; i++) {    // sort in ascending 
            Arrays.sort(nums[i]);
        }

        int score = 0;    // to store in final answer 

        for (int j = 0; j < m; j++){    // for column 
            int max = 0;   // current column ka maximum
            for (int i = 0; i < n; i++) {     // for row 
                max = Math.max(max, nums[i][j]);   // max find
            }
            score += max;
        }
        return score;
    }
}