package SortingProgram;

public class naviePartition {
    static void NaviePar(int arr[], int l, int r, int pivot) {
        int n = arr.length;
        int temp[] = new int[r-l+1];
        int index = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] <= arr[pivot]){
                temp[index++] = arr[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(arr[i] > arr[pivot]){
                temp[index++] = arr[i];
            }
        }
        for(int i=0; i<n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args){
        int []arr = {3, 8, 6, 12, 10, 7};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        int p = n-1;    
        NaviePar(arr, 0, n-1, p);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
