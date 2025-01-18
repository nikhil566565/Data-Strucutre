package ArrayProgram;

public class subArrayOccurances {
    private  static void subArrQueries(int []arr, int qu[][], int q) {

        int len;
        int []res = new int[q];
        int res1 = 0;
        int l = 0;
        for(int i=0; i<q; i++) {
            len = 0;
            int left = qu[l][0];
            int right = qu[l][1];
            for(int j=left; j<=right; j++) {

                if(qu[l][2] == arr[j]){
                    len++;
                }
                
            }
            res[res1++] = len;
            l++;
        }
        for(int i=0; i<q; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};
        int qu[][] = {
            {0, 3, 5},
            {1, 2, 5},
            {0, 1, 6}
        };
        int q = 3;

        subArrQueries(arr, qu, q);
    }
    
}