class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatches = 0;
        int i =0,index=0,j=0;
        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }

        else if(ruleKey.equals("name")){
            index = 2;
        }

        for(i=0;i<items.size();i++){
            List<String> list = items.get(i); 
            if(list.get(index).equals(ruleValue))
                    countMatches++;
            
        }
        return countMatches;
    }
}