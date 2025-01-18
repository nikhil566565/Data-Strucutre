// package AarryImportantQuestions;

/**
 * LargestSumPair
 */
public class LargestSumPair {
    private static int largestPairSum(int arr[]) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
                                
        for(int i=0; i<arr.length; i++) {
            if(first < arr[i]) {
                second = first;
                first = arr[i];
            }
            else if(second < arr[i]) {
                second = arr[i];
            }
        }
        return first+ second;

    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 10, 6, 40};
        
        System.out.println(largestPairSum(arr));
    }
}