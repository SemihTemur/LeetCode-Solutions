class Solution {
    public int[] finalPrices(int[] prices) {
        int i=0,j=0,index = 0;
        int[] finalPrices = new int[prices.length];
        
        for(i=0;i<prices.length;i++){
            int flag = 0;
           for(j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    finalPrices[index++] = prices[i]-prices[j];
                    flag = 1;
                    break;
                }
           }
           if(flag==0)
             finalPrices[index++] = prices[i];
        }

        return finalPrices;
    }
}