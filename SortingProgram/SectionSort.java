package SortingProgram;
import java.util.*;

public class SectionSort {
    // Function to perform selection sort
    static void SectionSort(ArrayList<Integer> arr, int size) {
        int arr_index;
        for(int i=0; i<size-1; i++) {
            arr_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(j) < arr.get(arr_index)) {
                    arr_index = j;
                }
            }
            if (arr_index != i) {
                // Swap the elements
                Collections.swap(arr, i, arr_index);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        // Initialize the ArrayList
        ArrayList<Integer> arr = new ArrayList<>(size);

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        // Perform selection sort
        SectionSort(arr, size);

        // Output sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Close the scanner
        sc.close();
    }
}
