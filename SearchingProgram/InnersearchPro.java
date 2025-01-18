package SearchingProgram;

public class InnersearchPro{
    public static int NavieinfiniteSearch(int arr[], int x) {
        int i=0;
        while(true) {
            if(arr[i] == x) return i;
            if(arr[i] > x) return -1;
            i++;
        }
        // return 
    }
    private static int BSA(int arr[], int x, int s, int e) {
         
        if(e > s) { 
            int mid = (s+e)/2; 

            if(arr[mid] == x) 
                return mid;
            else if(arr[mid] < x) 
                s = mid+1;
            else 
                e = mid-1;
        }
        return -1; 
    }
    public static int EfficentInfiniteSearch(int arr[], int x) {
        if(arr[0] == x) return 0;

        int i=1;
        while(arr[i] < x) {
            i = i*2;
            if(arr[i] == x) return i;
        }
        return BSA(arr, x, i/2+1, i-1);
    }
     public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};

        System.out.println(NavieinfiniteSearch(arr, 40));
        System.out.println(EfficentInfiniteSearch(arr, 40));
    }       
}
