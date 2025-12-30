class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        int i=0,j=0;
        for(i=0;i<accounts.length;i++){
            int  result = 0;
            for(j=0;j<accounts[0].length;j++){
                result = result + accounts[i][j];
            }
            if(result>maximumWealth)
                maximumWealth = result;
        }

        return maximumWealth;
    }
}