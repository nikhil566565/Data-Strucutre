package ArrayProgram;

public class MaximizeNumberof1s {
    static private int Max1SNum(int []arr, int k) {
        int res = 0;

        int start = 0;
        int end = 0;
        int count = 0;

        while(end < arr.length) {
            if(arr[end] == 0) 
                count++;
            
                while(count > k) {
                    if(arr[start] == 0)
                        count--;
                    start++;
                }
                System.out.println(start);
                res = Math.max(res, ((end - start) + 1));
            end++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 1};
        int k = 1;
        System.out.println(Max1SNum(arr, k));
    }
}
