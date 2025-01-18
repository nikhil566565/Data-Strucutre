package ArrayProgram;
//  Our Task: Given an array of integers of size 'n'. Our aim is to calculate the maximum sum of 'k' consecutive elements in the array.

public class slidingWindow {
    public static int slidingWin(int []arr, int k) {
        int n = arr.length;
        int res = 0;
        int curr = 0; 
        for(int i=0; i<k; i++) {
            curr += arr[i]; // 1 + 8 + 30 - 5 = 34
            // System.out.println(curr);
        }
        for(int i=k; i<n; i++) {
            curr = curr + arr[i] - arr[i-k]; // 34 = 34 + 20 - 1
            res = Math.max(res, curr);
        }
        return curr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k=4;
        System.out.println(slidingWin(arr, k));
    }
}
