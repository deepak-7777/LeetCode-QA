class Solution {
    public int fib(int n) {

        // first and second no. are always  fix.
        if(n == 0)      // first no.
            return 0;
        
        if(n == 1)      // second no.
            return 1;
        
        return fib(n - 1) + fib(n - 2);       // return after 2 no.
    }
}