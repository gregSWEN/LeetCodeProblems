class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = Integer.MAX_VALUE; //Minimum
        int maxProfit = 0;
        //Find the minimum, and while the next values are larger, calculate the possible 
        //return
        //if the return is bigger than the biggest return we already have, 
        //we can replace it. 
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < bestBuy){
                bestBuy = prices[i];
            }
            if(i < (prices.length - 1)){
                int currentReturn =  prices[i+1] - bestBuy;
                if(currentReturn > maxProfit){
                    maxProfit = currentReturn;
                }
            }
            
        }
        return maxProfit;
        
    }
}