// package AarryImportantQuestions;
import java.util.Arrays;

public class minimaumDiff {
    static int MinimaumDiff(int arr[]) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int diff;
        for(int i=0; i<n; i++) { 
            for(int j=i+1; j<n; j++) { 
                diff = Math.abs(arr[i] - arr[j]);
                if(min > diff) {
                    min = diff;
                }
            }
        }

        return min;
    }
    // ************** Efficient Code: ************** 
    static int EfficientDifference(int arr[]){
        int n =arr.length;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int diff;
        for(int i=0; i<n-1; i++) {
            diff = arr[i+1]-arr[i];
            if(min > diff)
                min = diff;
        }
        return min;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 8, 12, 5, 18};
        System.out.println(MinimaumDiff(arr));
        System.out.println(EfficientDifference(arr));

    }
}
