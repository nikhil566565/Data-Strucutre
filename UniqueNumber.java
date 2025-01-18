// Find the unique number in a given array where all the elements are being repeated twicw with one value being unqiue.

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 4, 5};
        int size = arr.length;

        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1; 
                }
            }
        }

        
        for (int num : arr) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
    }
}
