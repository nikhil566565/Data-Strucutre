package SortingProgram;
import java.util.Scanner;

public class BubbleSortArray {
    // Function to perform bubble sort
    static void bubbleSort(int[] arr, int size) {
        for (int counter=1; counter<size; counter++) {
            for (int i = 0; i<size-counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input array size
        System.out.print("Enter Number of Array: ");
        int size = s.nextInt();

        // Initialize the array
        int[] arr = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        // Perform bubble sort
        bubbleSort(arr, size);

        // Display sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // Close the scanner
        s.close();
    }
}
