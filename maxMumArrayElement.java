public class maxMumArrayElement {

    // Efficient Approach:  Time Complexity: O(N + MAX) 
    //                      Auxiliary space: O(MAX)
    public static int freqMaximumEle(int left[], int right[]) {
        int n = left.length;
        int freq[] = new int[101];

        for(int i=0; i<n; i++) {
            freq[left[i]]++;    
            freq[right[i]+1]--;
        }
        for(int i=1; i<100; i++) {
            freq[i] = freq[i-1]+freq[i];
        }
        int res = 0;
        int max = 0;
        for(int i=1; i<100; i++) {
            if(max < freq[i]) {
                max = freq[i];
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int left[] = {1,2,4};
        int right[] = {4,5,7};

        System.out.println(freqMaximumEle(left, right));
    }
}
