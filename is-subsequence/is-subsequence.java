class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j=0;

        // Map<Character,Integer> sMap = new HashMap<Character,Integer>();
        // Map<Character,Integer> tMap = new HashMap<Character,Integer>();

        // for(char c:s.toCharArray())
        //     sMap.merge(c,1,Integer::sum);
        
        // for(char c:t.toCharArray())
        //     tMap.merge(c,1,Integer::sum);
        
        // for(char c:s.toCharArray()){
        //     if(!tMap.containsKey(c) || sMap.get(c)>tMap.get(c))
        //         return false;
        // }

        if(s.length()>t.length())
            return false;

        for(i=0;i<t.length();i++){
            if(j<s.length() && t.charAt(i)==s.charAt(j))
                j++;
        }



        return s.length() == j ? true : false;
    }
}