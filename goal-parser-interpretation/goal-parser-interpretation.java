class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        char[] chars = command.toCharArray();

        for(i=0;i<chars.length;){
            if(chars[i]=='G'){
                sb.append(chars[i]);
                i++;
            }
            else if(chars[i]=='(' && chars[i+1]==')'){
                sb.append('o');
                i = i+2;
            }
            else{
                sb.append("al");
                i = i+4;
            }
        }

        return sb.toString();
    }
}