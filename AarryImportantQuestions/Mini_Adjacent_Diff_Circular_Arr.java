public class Mini_Adjacent_Diff_Circular_Arr {
    public static int absoluteDiff(int []arr) {

        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int Abs = 0;
        for(int i=1; i<n; i++) {
            Abs = Math.abs(arr[i]-arr[i-1]);
            // System.out.print(Abs +" ");
            min = Math.min(min, Abs);
            if(i == n-1) {
                Abs = arr[i] - arr[0];
                min = Math.min(min, Abs);
            
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};

        System.out.println( absoluteDiff(arr));
    }
}
