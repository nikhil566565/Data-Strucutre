/*  *************************** Left Rotate an Array by D places ***************************

    * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

    Examples:  

        Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
        Output: 3 4 5 6 7 1 2

        Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
        Output: 5 6 7 1 2 3 4   
         

 */


class leftRotateArray {
    static void leftRotate(int arr[], int d, int n) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 29, 42, 51, 94, 1, 35, 65, 25, 40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53,
                57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7,
                84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65 },
                n = 77, d = 69;

        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        leftRotate(arr, d, n);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}