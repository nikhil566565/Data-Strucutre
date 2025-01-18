package ArrayProgram;

public class SubArrraySum {
    private static void sumSubArr(int arr[], int tar) {
        int n = arr.length;
        int sum;
        int count = 0;
        for(int i=0; i<n; i++) {
            sum = 0;
            for(int j=i; j<n; j++) {
                sum += arr[j];
                if(tar == sum)
                    count++;
            }
        }
        if(count == 0)
            count = -1;
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};

        int tar = 31;
        sumSubArr(arr, tar);
    }
}
