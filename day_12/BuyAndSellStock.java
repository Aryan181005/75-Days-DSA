package day_12;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProf = 0;

        for(int i=1; i<prices.length; i++){
            maxProf = Math.max(maxProf, prices[i] - minPrice);

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return maxProf;
    }
}