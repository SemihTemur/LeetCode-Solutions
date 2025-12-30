class Solution {
    public String truncateSentence(String s, int k) {
        String[] truncateSentence = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int i;

        for(i=0;i<k;i++){
            if(i==k-1){
                sb.append(truncateSentence[i]);
            }
            else{
                sb.append(truncateSentence[i]+" ");
            }
        }

        return sb.toString();
    }
}