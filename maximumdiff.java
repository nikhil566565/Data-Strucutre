/* *********************** Maximum Difference Problem with Order ***********************
 * 
    * Given an array arr[] of integers, find out the maximum difference between any two elements such that larger element appears after the smaller number. 

    Examples : 
        Input : arr = {2, 3, 10, 6, 4, 8, 1}
        Output : 8
        Explanation : The maximum difference is between 10 and 2.
        
        Input : arr = {7, 9, 5, 6, 3, 2}
        Output : 2
        Explanation : The maximum difference is between 9 and 7.
 * 
 * 
 * 
 * 
 */
public class maximumdiff {      
    // Navie Solution
    static int maxDiffNavie(int arr[]) {
        int n = arr.length;
        int diff = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(((arr[j] - arr[i]) > diff)) {
                    diff = arr[j]-arr[i];
                }
            }
        }
        return diff;
    }
    
    // Efficient Soultion
    /* Method 2 (Tricky and Efficient) 
        * In this method, instead of taking difference of the picked element with every other element, we take the difference with the minimum element found so far. So we need to keep track of 2 things: 
            1) Maximum difference found so far (max_diff). 
            2) Minimum number visited so far (min_element). */
            
    static int maxDiff(int[] arr) { 
        int res = arr[1] - arr[0];
        int min_ele = arr[0];

        for(int i=1; i<arr.length; i++) {
            res = Math.max(res, arr[i]- min_ele);
            min_ele = Math.min(min_ele, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        // int []arr = {2, 3, 10, 6, 4, 8, 1};
        int []arr = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiff(arr));
    }
}