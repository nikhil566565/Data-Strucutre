package SortingProgram;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSorting {
    static void bucketSort(int arr[], int k) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++) { 
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        max++;

        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<k; i++) { 
            bkt.add(new ArrayList<Integer>());
        }
        for(int i=0; i<n; i++) { 
            int bi = (arr[i]*k)/max;
            bkt.get(bi).add(arr[i]);
        }
        for(int i=0; i<k; i++) { 
            Collections.sort(bkt.get(i));
        }
        int index = 0;
        for(int i=0; i<k; i++) { 
            for(int j=0; j<bkt.get(i).size(); j++) { 
                arr[index++] = bkt.get(i).get(j);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {30, 40, 10, 80, 5, 12, 70};
        int k = 4;

        bucketSort(arr, k);
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}
