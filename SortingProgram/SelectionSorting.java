package SortingProgram;
public class SelectionSorting {
    static void selectionSorting(int arr[]) {
        int n = arr.length;
        int min;
        for(int i=0; i<n; i++) {
            min = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] =  {11,43,53,543,54352,52344};

        System.out.print("Noraml Array is : ");
        printArray(arr);
        selectionSorting(arr);
        System.out.print("Modify Array is : ");
        printArray(arr);
    }
}
