package ArrayProgram;
public class BinarySearch {
    static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length;
        while(low < high) {
            int mid = (low+high)/2;

            if(arr[mid] == x) {
                return mid;
            }
            else if(arr[mid] > x ) {
                high = mid-1;
            }
            else if(arr[mid] < x) {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int x = 6; 
        System.out.println("Element is :"+binarySearch(arr, x));
    }
}
