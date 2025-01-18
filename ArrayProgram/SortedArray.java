package ArrayProgram;

public class SortedArray {
    static boolean isSorted(int arr[]) {
        for(int i=0; i<(arr.length-1); i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] =  {20, 30, 40, 50, 100};

        if(isSorted(arr)) {
            System.out.print("Array is Sorted.");
        }   else {
            System.out.print("Array is not Sorted.");
        }
    }
}
