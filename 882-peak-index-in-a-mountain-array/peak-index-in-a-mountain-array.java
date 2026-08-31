class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Increasing ke liye 
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // Decreasing ke liye 
            else {
                high = mid;
            }
        }
        return low; // Peak index
    }
}