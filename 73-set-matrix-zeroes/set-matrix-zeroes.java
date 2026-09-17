class Solution {
    public void setZeroes(int[][] matrix) {

    int n = matrix.length;
    int m = matrix[0].length;

    boolean fr = false;   // first row
    boolean fc = false;   // first col

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {

            if (matrix[i][j] == 0) {

                if (i == 0) {      // agar fr pe 0 ho to 
                    fr = true;     // pure row ko 0
                }

                if (j == 0) {     // agar fc pe 0 ho to 
                    fc = true;    // pure col ko 0 
                }

                matrix[0][j] = 0;  // agar col mai kahi bhi 0 ho to first point ko 0 (trace)
                matrix[i][0] = 0;  // agar row mai kahi bhi 0 ho to first point ko 0 (trace)
            }
        }
    }

    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {

            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;   // pure row and col ko 0
            }
        }
    }

    if (fr) {
        for (int i = 0; i < m; i++) {
            matrix[0][i] = 0;
        }
    }

    if (fc) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }
                   //     https://www.youtube.com/watch?v=-T0VAx1_ngU
  }
}