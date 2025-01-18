package SortingProgram;

/**
 * lumoto
 */

public class lumotoPartition {
    static int lomutoSort(int arr[], int start, int last) {
        int pivot = arr[last];
        int s = start-1;
        for(int i=start; i<=last-1; i++) {
            if(arr[i] <= pivot) {
                ++s;
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp; 
            }
        }   
        ++s;
        int temp = arr[s];
        arr[s] = arr[last] ;
        arr[last] = temp; 
        return s;
    }
    static void quickSort(int arr[], int start, int last) {
        if(start < last) {
            int piv = lomutoSort(arr, start, last);

            quickSort(arr, start, piv-1);
            quickSort(arr, piv+1, last);
        }
    }
    public static void main(String[] args) {
        int []arr = {3, 8, 6, 12, 10, 70};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] +" ");
        }
        // int val = lomutoSort(arr, 0, n-1);

        // System.out.print(val);
    }
    
}