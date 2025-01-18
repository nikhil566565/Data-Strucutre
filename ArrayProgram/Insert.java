package ArrayProgram;

public class Insert {
    static int isSearch(int arr[] , int n, int pos, int cap, int Ele) {
        if(n == cap)
            return n;
        int inx = pos-1;
        for(int i=n-1; i>=inx; i--) {
            arr[i+1] = arr[i];
        }
        arr[inx] = Ele;  
        return (n+1);
    }
    public static void main(String[] args) {
        int cap = 10;
        int []arr = new int[cap];
        arr[0] = 10; arr[1] = 20; 
        arr[2] = 30; arr[3] = 40; 
        arr[4] = 50; arr[5] = 60; 
        

        int n = 6, pos = 2;
        System.out.println("Before printing Ele : " );
        for(int i=0; i<n; i++)
            System.out.print(arr[i] +" ");

        int Ele = 0;
        n = isSearch(arr, n, pos, cap, Ele); 
        System.out.println("After array Ele :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
