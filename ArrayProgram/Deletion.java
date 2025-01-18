package ArrayProgram;
public class Deletion {
    static int isDelete(int arr[], int n, int ele) {
        int i;
        for(i=0; i<n; i++) {
            if(arr[i] == ele)
                break;
        }
        if(n == i)
            return n;
        for(int j=i; j<n-1; j++) {
            arr[i] = arr[i+1];
        }
        return (n-1);
    }
    public static void main(String[] args) {
        int cap = 10;
        int []arr = new int[cap];
        arr[0] = 10; arr[1] = 20; 
        arr[2] = 30; arr[3] = 40; 
        arr[4] = 50; arr[5] = 60; 

        int n = 6;
        System.out.println("Before printing Ele : " );
        for(int i=0; i<n; i++)
            System.out.print(arr[i] +" ");

        int Ele = 60;
        n = isDelete(arr, n, Ele); 
        System.out.println("After array Ele :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
