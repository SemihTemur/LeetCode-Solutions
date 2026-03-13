class Solution {
    public boolean rotateString(String s, String goal) {
        int length = s.length();
        int i = 0;

        while(i<length){
            String value = s.substring(i) + s.substring(0,i);
            if(value.equals(goal))
                return true;
            i++;
        }

        return false;
    }
}