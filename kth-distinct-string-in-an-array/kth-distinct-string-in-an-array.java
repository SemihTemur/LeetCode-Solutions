class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<>();

        for(String s:arr){
            if(!set.add(s))
                list.remove(s);
            else
                list.add(s);
        }

        
        if(list.size()<k)
            return "";
        return list.get(k-1);
    }
}