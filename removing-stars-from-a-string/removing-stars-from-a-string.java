class Solution {
    public String removeStars(String s) {
        Stack<Character> removeStars = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='*')
                removeStars.pop();
            else
               removeStars.push(c);
        }

        StringBuilder sb = new StringBuilder();

        for(Character c:removeStars)
            sb.append(c);
        
        return sb.toString();
    }
}