class Solution {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<Integer>();

        for(char c : s.toCharArray()){
            if(c>=48 && c<=57){
                int num = c-'0';
                if(!list.contains(num))
                     list.add(num);
            }
        }

        Collections.sort(list);

        if(list.size()<2)
            return -1;

        return list.get(list.size()-2);
    }
}