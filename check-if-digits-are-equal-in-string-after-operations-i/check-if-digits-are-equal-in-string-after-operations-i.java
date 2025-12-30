class Solution {
    public boolean hasSameDigits(String s) {
        int i=0;
        String wordString = new String();
        while(s.length()>2){
            for(i=0;i<s.length()-1;i++){
                int number1 = (int) s.charAt(i);
                int number2 = (int) s.charAt(i+1);
                int result = (number1+number2)%10;
                wordString = wordString + Integer.toString(result);
            }
            s = wordString;
            wordString = "";
        }
        if(s.charAt(0)==s.charAt(1))
            return true;
        return false;
    }
}