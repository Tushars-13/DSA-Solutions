/*
The problem says ki array of prices of stock given hai ek din khareed ke kisi aur din bechna hai taaki maximum profit mile
*/

class Solution {
    public int maxProfit(int[] prices) {  
      int minprice = prices[0]; // sbse pehle price ko minnimum price assume kr lo
        int maxProfit = 0; // initially maximum profit ko 0 maano

        for(int i = 0; i<prices.length; i++){ // traverse the prices array
            if(prices[i]<minprice){  // if the price is smaller than minimum price update minimum price
                minprice = prices[i];
            }

            int Profit = prices[i]-minprice;  // profit calculate kro by (current price - minimum price) 

            if(Profit > maxProfit){ // compare krke maximum Profit update krdo
                maxProfit = Profit;
            }
        }

        return maxProfit; // return kr do maximum profit
    }
}
