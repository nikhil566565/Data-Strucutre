/* ************************************* Maximum consecutive 1s *************************************
    
    * Given n numbers (both +ve and -ve), arranged in a circle, find the maximum sum of consecutive numbers. 

    Examples: 

        Input: a[] = {8, -8, 9, -9, 10, -11, 12}
        Output: 22 (12 + 8 - 8 + 9 - 9 + 10)

        Input: a[] = {10, -3, -4, 7, 6, 5, -4, -1} 
        Output:  23 (7 + 6 + 5 - 4 -1 + 10) 

        Input: a[] = {-1, 40, -14, 7, 6, 5, -4, -1}
        Output: 52 (7 + 6 + 5 - 4 - 1 - 1 + 40)
 * 
 */

public class circulerMaximumSubArray {
    static int normalMaxSubArray(int arr[], int n) {
        int max = arr[0];
        int res = arr[0];

        for(int i=1; i<n; i++) {
            max = Math.max(arr[i], (arr[i] + max));
            res = Math.max(res, max);
        }
        return res;
    }
    
    static int circulerMaximumSubArr(int arr[]) {
        int n = arr.length;
        int normal_Sum = normalMaxSubArray(arr, n);

        if(normal_Sum < 1)
            return normal_Sum;

        int arr_Sum = 0;
        for(int i=0; i<n; i++) {
            arr_Sum += arr[i];
            arr[i] = -arr[i];
        }
        int circulerSum = arr_Sum + normalMaxSubArray(arr, n);

        return Math.max(circulerSum, normal_Sum);
    }

    public static void main(String[] args) {
        int arr[] = {11, 10, -20, 5, -3, -5, 8, -13, 10 };
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        System.out.println(circulerMaximumSubArr(arr));
    }
}
