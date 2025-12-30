class Solution {
    public String largestOddNumber(String num) {
        int i,j;
        for(i=num.length()-1;i>=0;i--){
           int lastDigit = (int) num.charAt(i);
           if(lastDigit%2!=0){
                StringBuilder sb = new StringBuilder();
                for(j=0;j<=i;j++){
                    sb.append(num.charAt(j));
                }
                return sb.toString();
           }
           
        }
        return "";
    }
}