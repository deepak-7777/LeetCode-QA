class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {                    // base case 
        return false;
        }
    return (n & (n - 1)) == 0;   // & (And operator) dono number ke binary ko compare karta hai 
    }
}