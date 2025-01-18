// package AarryImportantQuestions;


import java.util.ArrayList;
import java.util.List;

// *************************** Boyer-Moore Majority Voting Algorithm ***************************



public class MajorityVote {
    public static List<Integer> majorityVote(List<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();

        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        int n = list.size();
        for(int i=0; i<n; i++) {
            int num = list.get(i);
            if(num == candidate1)
                count1++;
            else if(num == candidate2)
                count2++;
            else if(count1 == 0) {
                candidate1 = num;
                count1++;
            }
            else if(count2 == 0) {
                candidate2 = num;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify the candidates
        count1 = 0;
        count2 = 0;

        for(int i=0; i<n; i++) {
            int num = list.get(i);
            if(candidate1 == num)
                count1++;
            else if(candidate2 == num) 
                count2++;  
        }

        if(count1 > n/3)
            res.add(candidate1);
        if(count2 > n/3)
            res.add(candidate2);

        if(res.isEmpty())
            res.add(-1);

        return res;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        // list.add(6);
        List<Integer> res = majorityVote(list);
        int i=0;
        while(!res.isEmpty()) {
            System.out.print(res.remove(i) + " ");
        }
    }
}
