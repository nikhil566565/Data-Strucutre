package SortingProgram;

public class BubbleSorting {
    void bubbleSoritng(int arr[]) {
        int n=arr.length;
        boolean swapped;
        for(int i=0; i<n; i++) {
            swapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                if(swapped == false) {
                    break;
                }
            }
        }
    }

    void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSorting ob = new BubbleSorting();
        int arr[] = {5,4,3,2,1};
        System.out.println("Orignal  Array. ");
        ob.printArray(arr);
        ob.bubbleSoritng(arr);
        System.out.print("Bubble Sorting Array : ");
        ob.printArray(arr);

    }
}
