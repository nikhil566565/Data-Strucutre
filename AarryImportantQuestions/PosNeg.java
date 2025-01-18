// package AarryImportantQuestions;
public class PosNeg {
    static void Pos(int arr[]) {
        for(int i=0; i<arr.length; i++)  {
            if(arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {-1 , 3, -5, 9, -8};
        Pos(arr);
    }
}
