// package AarryImportantQuestions;
import java.util.Arrays;
import java.util.Comparator;
/**
 * MergerOverlaping
 */
public class MergerOverlaping {
    static class Interval {
        int start;
        int end;
            Interval(int start, int end) {
                this.start = start;
                this.end = end;
            }
    }
    static void mergeInterval(Interval arr[], int n) {
        Arrays.sort(arr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2) { 
                return i1.start - i2.start;
            }
        });
        int res = 0;

        for(int i=1; i<n; i++) {
            if(arr[res].end >= arr[i].start) 
            {
                arr[res].end = Math.max(arr[res].end, arr[i].end);
                arr[res].start = Math.min(arr[res].start, arr[i].start);
            }
            else {
                res++;
                arr[res] = arr[i];
            }
        }
        for(int i=0; i<=res; i++) {
            System.out.println("["+arr[i].start +" "+ arr[i].end+ "]");
        }
    }
    public static void main(String[] args) {
        Interval arr[] = {  new Interval(5,10), 
                            new Interval(3,15), 
                            new Interval(18,30), 
                            new Interval(2,7)};

        int n = arr.length;

        mergeInterval(arr, n);
    }
}