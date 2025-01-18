import java.util.Scanner;

public class SearchArray {

    // Function to perform binary search
    static void BinarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("The Value " + arr[mid] + " is Available in Array.");
                return;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("The Value is not Available in Array.");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        // Initialize the array
        int[] arr = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the array
        System.out.println("Array Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Input key to search
        System.out.print("Enter a key: ");
        int key = sc.nextInt();

        // Call the binary search function
        BinarySearch(arr, size, key);

        // Close the scanner
        sc.close();
    }
}
