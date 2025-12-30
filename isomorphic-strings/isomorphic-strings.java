class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<Character,Character>();
        Map<Character,Character> tMap = new HashMap<Character,Character>();
        int i;
        for(i=0;i<s.length();i++){
            sMap.put(s.charAt(i),t.charAt(i));
            tMap.put(t.charAt(i),s.charAt(i));
        }

        for(i=0;i<s.length();i++){
            if(sMap.get(s.charAt(i))!=t.charAt(i) || tMap.get(t.charAt(i))!=s.charAt(i) )
                return false;
        }
          

        return true;
    }
}