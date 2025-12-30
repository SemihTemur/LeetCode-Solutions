class Solution {
    public boolean isValid(String s) {
       Stack<Character> stackList = new Stack<>();
       for(char c : s.toCharArray()){
            if(c =='(')
                stackList.push(')');
            else if(c=='{')
                stackList.push('}');
            else if(c=='[')
                stackList.push(']');
            else {
                if(stackList.isEmpty() || stackList.pop()!=c){
                    return false;
                }
            }
       }
       return stackList.isEmpty();
    }

}