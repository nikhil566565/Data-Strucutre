/*  ******************* Boyer-Moore Voting algorithm ******************* 
    * In its most basic form, the algorithm seeks out a majority element if one exists. A majority element is one that appears more than half of the time in the input elements. However, if there is no majority, the algorithm will not recognize this and will continue to output one of the items.

    * The algorithm is divided into two parts. A first pass identifies an element as a majority, and a second pass confirms that the element identified in the first pass is indeed a majority.

    * The method will not identify the majority element if it does not exist, and will thus return an arbitrary element.

    *** Alogorithm :

        1. Begin by initializing two variables, candidate and a counter count, both of which are set to 0.
        2. Now we’ll begin iterating over the number and for each element num.
        3. We first check to see if the count is 0, and then we assign num to candidate.
        4. Then we check to see if the current num is equal to candidate, if not, we decrease the count by one, else we increment it by one.
        5. Reset the counter to zero.
        6. Find the frequency of the candidate variable by looping through the array.
        7. Now, if the count is larger than N/2, we return candidate; otherwise we return -1.

        Illustration:
            Input: {1, 7, 2, 7, 8, 7, 7}
            Index 0: candidate = 1, count = 1
            Index 1: candidate = 1, count = 0 (7 not equal to 1)
            Index 2: candidate = 2 (as the count is 0 we initalise num to current), count = 1
            Index 3: candidate = 2, count = 0 ( 7 not equal to 2)
            Index 4: candidate = 8 (as the count is 0 we initalise num to current), count = 1
            Index 5: candidate = 8, count = 0 ( 7 not equal to 8)
            Index 6: candidate = 7 (as the count is 0 we initalise num to current), count = 1

            Now we can check for the frequency of 7, i.e, 4 which is > 7/2.


*/

public class BoyeerMoreVotingAlgo {
    private static int BoyeerVoting(int arr[]) {
        int candidate = 0;
        int count = 0;
        int n = arr.length;

        for(int num : arr) {
            if(count == 0) {
                candidate = num;
            }
            if(candidate == num){
                count++;
            }
            else {
                count--;
            }
        }
        count = 0;
        for(int num : arr) {
            if(num == candidate) 
                count++;
        }

        if(count > n/2) {
            return candidate;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 2, 7, 8, 7, 7};

        System.out.println(BoyeerVoting(arr));
    }
}
