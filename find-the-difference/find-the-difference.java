class Solution {
    public char findTheDifference(String s, String t) {
       if(s.length()==0)
            return t.charAt(0); 
        int i;
        char[] sCharArrays = s.toCharArray();
        char[] tCharArrays = t.toCharArray();

        Arrays.sort(sCharArrays);
        Arrays.sort(tCharArrays);

        for(i=0;i<sCharArrays.length;i++){
            if(tCharArrays[i]!=sCharArrays[i]){
                return tCharArrays[i];
            }
        }

        return tCharArrays[tCharArrays.length-1] ;
    }
}