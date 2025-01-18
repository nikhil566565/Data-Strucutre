// ************************** Stock Buy and Sell Problem **************************
/*
    * The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earn by buying on day 0, selling on day 3. Again, buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

        * In this approach, we just need to find the next greater element and subtract it from the current element so that the difference keeps increasing until we reach a minimum. If the sequence is a decreasing sequence, so the maximum profit possible is 0.
   
 */

public class Stock_Buy_Sell {
    static int maxProfit(int prices[], int size) {
        // maxProfit adds up the difference between
        // adjacent elements if they are in increasing order
        int maxProfit = 0;
    
        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < size; i++)
            if (prices[i] > prices[i - 1]) 
                maxProfit += prices[i] - prices[i - 1];

        return maxProfit;
    }
    public static void main(String[] args) {
         // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        // function call
        System.out.println(maxProfit(price, n));
    }
}
