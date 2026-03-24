package Array;

public class stock{

    public static int stockMaxProfit(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int p=0; p<prices.length; p++){

            if(buyPrice < prices[p]){

                int profit = prices[p] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            
            }else{

                buyPrice = prices[p];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stockMaxProfit(prices));
        
    }
}