class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray())
            sb.append(c);

        int i = 0;
        
        for(i=0;i<sb.length();){
            if(i!=0 && sb.charAt(i)>47 && sb.charAt(i)<58){
                if(sb.charAt(i-1)<48 || sb.charAt(i-1)>58){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                    i = 0;
                }
            }
            else
                i++;
        }

        return sb.toString();
    }
}