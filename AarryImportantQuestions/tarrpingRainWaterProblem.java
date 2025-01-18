/* *********************************
 * 
    * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

    Examples:  
        Input: arr[]   = {2, 0, 2}
        Output: 2

        Explanation:
            We can trap 2 units of water in the middle gap.

        Input: arr[] = {3, 0, 2, 0, 4}
        Output: 7

        Explanation:
            We can trap "3 units" of water between 3 and 2, "1 unit" on top of bar 2 and "3 units" between 2  and 4.  See below diagram also.


        Method 1 : This is a simple solution to the above problem.
            Approach: The idea is to traverse every array element and find the highest bars on the left and right sides. Take the smaller of two heights. The difference between the smaller height and height of the current element is the amount of water that can be stored in this array element.

        Algorithm: 
            1. Traverse the array from start to end.
            2. For every element, traverse the array from start to that index and find the maximum height (a) and traverse the array from the current index to end, and find the maximum height (b).
            4. The amount of water that will be stored in this column is min(a,b) - array[i], add this value to the total amount of water stored
            5. Print the total amount of water stored.

        
        Method 2: This is an efficient solution to the above problem.

            Approach: In the previous solution, to find the highest bar on the left and right, array traversal is needed, which reduces the efficiency of the solution. To make this efficient, one must pre-compute the highest bar on the left and right of every bar in linear time. Then use these pre-computed values to find the amount of water in every array element.

        Algorithm: 
            1. Create two arrays left and right of size n. create a variable max_ = INT_MIN.
            2. Run one loop from start to end. In each iteration update max_ as max_ = max(max_, arr[i]) and also assign left[i] = max_
            3. Update max_ = INT_MIN.
            4. Run another loop from end to start. In each iteration update max_ as max_ = max(max_, arr[i]) and also assign right[i] = max_
            5. Traverse the array from start to end.
            6. The amount of water that will be stored in this column is min(a,b) - array[i],(where a = left[i] and b = right[i]) add this value to total amount of water stored
            7. Print the total amount of water stored.
 * 
 */

public class tarrpingRainWaterProblem {
    // ******************** Navie Approch ************************
    public static int RainWater(int arr[]) {
        int res = 0;
        int n = arr.length;

        for(int i=1; i<n-1; i++) {
            int lmax = arr[i];
            for(int j=0; j<i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];

            for(int j=i+1; j<n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }
            res += (Math.min(lmax, rmax)) - arr[i];
        }

        return res;
    }
    // ************************ Better Approch ************************
    public static long rainWater(int arr[]) {
        long res = 0;
        int n = arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        lmax[0] = arr[0];
        for(int i=1; i<n; i++) {
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--) {
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }

        for(int i=1; i<n-1; i++) {
            res += (Math.min(lmax[i], rmax[i])) - arr[i];
        }
        return res;
    }
    public static void main(String[] args) {

        int arr[] = {3,5,2,3};

        System.out.println(RainWater(arr));
        System.out.println(rainWater(arr));
    }
}



