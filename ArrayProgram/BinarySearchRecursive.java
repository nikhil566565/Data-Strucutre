package ArrayProgram;
public class BinarySearchRecursive {
    static int binaryRecursive(int arr[], int x, int start, int end) {
        if(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == x) 
                return mid;
            else if(arr[mid] > x)
                return binaryRecursive(arr, x, start, mid-1);
            else if(arr[mid] < x) 
                return binaryRecursive(arr, x, mid+1, end);

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int x = 50;
        System.out.println(binaryRecursive(arr, x, 0, n-1));
    }
    
}
