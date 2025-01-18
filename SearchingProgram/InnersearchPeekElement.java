// package SeaechingProgram;
package SearchingProgram;
/**
 * InnersearchSortedRoteteArr
 */
public class InnersearchPeekElement {
    private static int NaviePeekElement(int arr[]) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int peek = -1;
        if(arr[0] > arr[1]) 
            peek = arr[0];
        if(arr[n-2] > arr[n-1]) {
            if(peek < arr[n-2] || peek == -1)
                peek = arr[n-2];
        }

        for(int i=1; i<n-1; i++) {
            if(arr[i] > arr[i-1] && arr[i+1] < arr[i]) {
                peek = Math.max(peek, arr[i]);
            }
        }
        return peek;
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 20, 12};

        System.out.println(NaviePeekElement(arr));
    }
    
}

