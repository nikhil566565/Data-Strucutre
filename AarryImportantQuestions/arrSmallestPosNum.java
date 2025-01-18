// package AarryImportantQuestions;


public class arrSmallestPosNum {
    public static int PosNeg(int arr[], int n) {
        int j=0;
        for(int i=0; i<n; i++)  {
            if(arr[i] <= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    private static int missingShift(int arr[], int size) {
        
        for(int i=0; i<size; i++) {
            int x = Math.abs(arr[i]);
            if(x - 1 < size && arr[x-1] > 0) {
                arr[x - 1] = -arr[x - 1];
            }
        }

        for(int i=0; i<size; i++) {
            if(arr[i] > 0) {
                return i + 1;
            }
        }
        return size + 1;
    }
    public static int smallestPos(int arr[]) {
        int n = arr.length;
        int shift = PosNeg(arr, n);
        int arr2[] = new int[n-shift];

        int j = 0;
        for(int i=shift; i<n; i++) {
            arr2[j++] = arr[i]; 
        }

        return missingShift(arr, j);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        System.out.println( smallestPos(arr));
    }
}
