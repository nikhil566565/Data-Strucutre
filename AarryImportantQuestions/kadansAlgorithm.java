
/* ********************** Kadane's Algorithm **********************
    Given an integer array arr, find the contiguous subarray (containing at least one number) which has the largest sum and returns its sum and prints the subarray.

    * Kadane's Algorithm employs a dynamic programming approach that iteratively calculates the maximum subarray sum ending at each position in the array. The critical insight behind the Algorithm is to consider the maximum subarray sum ending at the current position and update it based on the previous maximum subarray sum.

    * Step-by-Step Process of Kadane's Algorithm ::
        * Here's a step-by-step breakdown of how Kadane's Algorithm works:
        1. Initialize two variables, res and maxEnd to arr[0].
        2. Iterate through the array from left to right, examining each element one by one.
        3. For each element, update maxEnd as the maximum value is either the current element or the sum of the current element and maxEnd.
        4. Update res as the maximum of either the current res or maxEnd.
        5. Repeat steps 3 and 4 for all elements in the array.
        6. The value of res at the end of the iteration will be the maximum subarray sum.
 * 
 * 
 */


public class kadansAlgorithm {
    private static int KadaneAlgo(int []arr) {
        int res = arr[0];
        int maxEnd = arr[0];

        for(int i=1; i<arr.length; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        
        System.out.println(KadaneAlgo(arr));

    }
}
