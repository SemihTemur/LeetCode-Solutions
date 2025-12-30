class Solution {
    public String thousandSeparator(int n) {
        String thousandSeparator = Integer.toString(n);
        List<Character> list = new ArrayList<>();
        int i=0;
        if(thousandSeparator.length()<4)
            return thousandSeparator;
        
        StringBuilder sb = new StringBuilder();
        for(i=thousandSeparator.length()-1;i>=0;i--){
            if(list.size() !=0 && list.size()%3==0)
                sb.append(".");
            sb.append(thousandSeparator.charAt(i));
            list.add(thousandSeparator.charAt(i));
        }
        return sb.reverse().toString();
    }
}