package ArrayProgram;
public class ReverseArray {
    static void isReverse(int arr[], int n) {
        int start = 0;
        int end = n-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50};
        int n = arr.length;
        System.out.println("Before Array element is :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        isReverse(arr, n);
        System.out.println("After Aarry Element is :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
