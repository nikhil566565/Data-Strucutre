package ArrayProgram;
/**
 * LargestNumber
 */
public class LargestNumber {
    static int isLargest(int arr[]) {
        int inx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[inx]) {
                arr[inx] = i;
                inx = i;
            }
        }
        return (inx+1);
    }
    // static int isSecondLargest(int arr[]) {
    //     int res = -1, largest = 0;
    //     for(int i=1; i<arr.length; i++) {

    //     }

    // }
    public static void main(String[] args) {
        int arr[] =  {15, 10, 20, 4, 50};

        System.out.println("Largest Element  positon is: " +isLargest(arr));
        // System.out.println("Second Largest Element positon is: " +isSecondLargest(arr));
    }
    
}