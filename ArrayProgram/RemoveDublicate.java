// Remove Dublicate value in the Array...
package ArrayProgram;
public class RemoveDublicate {
    static int isRemoveDublicate(int arr[], int n){
        if(n==0 || n==1) 
            return n;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for(int i=0; i<n-1; i++) {
            if(temp[res-1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0; i<res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10};
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        n = isRemoveDublicate(arr, n);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
