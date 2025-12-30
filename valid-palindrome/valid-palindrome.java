class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        int i,j;
        for(char c:s.toUpperCase().toCharArray()){
            if(c>=48 && c<=57 || c>=65 && c<=90){
                builder.append(c);
            }
        }
        String newValue = builder.toString();
        j = newValue.length()-1;
        for(i=0;i<newValue.length()/2;i++){
            if(newValue.charAt(i)!=newValue.charAt(j))
                return false;
            j--;
        }
        return true;
    }
}