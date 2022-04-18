
/**
 * Write a description of class maxProfit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maxProfit
{
    static public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice)
                minprice = prices[i];
            else if(prices[i] - minprice > maxprofit)
                maxprofit =prices[i] - minprice;
        }
        return maxprofit;
    }
}
