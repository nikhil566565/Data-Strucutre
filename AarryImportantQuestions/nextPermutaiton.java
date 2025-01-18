

public class nextPermutaiton {
    private static void reverse(int []arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void NextPermutation(int []arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            reverse(arr, 0, n-1);
            return;
        }
        for(int i=n-1; i>=pivot; i--) {
            if(arr[i] > arr[pivot])  {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }
        }
        reverse(arr, pivot+1, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        NextPermutation(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
