package ArrayProgram;

public class MergeSorting {
    static void mergeSort(int a[], int b[]) {
        int m = a.length;
        int n = b.length;

        int k, i=0, j=0;
        int temp[] = new int[m+n];
        int nSize = temp.length;
        for(k=0; k<nSize; k++) {
            if(a[i] >= b[j]){
                temp[k] = b[j];
                j++;
                if(j >= m)
                    break;
            }
            else {
                temp[k] = a[i];
                i++;
                if(i >= n)
                    break;
            }
        }
        for(int z=k+1; z<nSize; z++){
            if(i != n){
                temp[z] = a[i];
            }
            if(j != m) {
                temp[z] = b[j];
            }
        }
        for(int z=0; z<nSize; z++) {
            System.out.print(temp[z] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {10, 15, 20};
        int b[] = {5, 6, 6, 15};
        
        mergeSort(a, b);
    }
}
