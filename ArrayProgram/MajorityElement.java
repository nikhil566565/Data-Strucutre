    /* ********************************* Majority Element *********************************
     * 
     * 
    * Write a function which takes an array and prints the majority element (if it exists), otherwise prints "No Majority Element". A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

    Examples : 
        Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
        Output : 4
        Explanation: The frequency of 4 is 5 which is greater
        than the half of the size of the array size. 

        Input : {3, 3, 4, 2, 4, 4, 2, 4}
        Output : No Majority Element
        
        Explanation: There is no element whose frequency is
        greater than the half of the size of the array size.
        
    METHOD 1 (Using Moore’s Voting Algorithm):   

        Approach: This is a two-step process. 
            A. The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
            B. Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.

        Algorithm: 
            1. Loop through each element and maintains a count of majority element, and a majority index, maj_index
            2. If the next element is same then increment the count if the next element is not same then decrement the count.
            3. if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
            4. Now again traverse through the array and find the count of majority element found.
            5. If the count is greater than half the size of the array, print the element
            6. Else print that there is no majority element

        Complexity Analysis:  
            Time Complexity: O(n). 
            As two traversal of the array is needed, so the time complexity is linear.
            
            Auxiliary Space: O(1). 
            As no extra space is required. 
    */


    package ArrayProgram;
    
    /**
     * InnerMajorityElement
     */
    public class MajorityElement {
        static int majorityElement(int arr[], int n) {
            int ans = 0;
            int count = 1;
            for(int i=1; i<n; i++) {
                if(arr[i] == arr[ans])
                    count++;
                else    
                    count--;

                if(count == 0) {
                    ans = i;
                    count = 1;
                }
            }
            count = 0;
            for(int i=0; i<n; i++) {
                if(arr[i] == arr[ans]) {
                    count++;
                }
            }
            if(count > n/2) {
                return arr[ans];
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,1,2,2,2,2,1};
            int n = arr.length;
            System.out.println(majorityElement(arr, n));
        }
        
    }






