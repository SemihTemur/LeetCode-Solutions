class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0,count2 = 0;
        int length = s.length();

        String s1 = s.substring(0,length/2);
        String s2 = s.substring(length/2,length);

        String vowels = "aeiouAEIOU";

        for(char c:s1.toCharArray()){
            if(vowels.indexOf(c)!=-1)
                count1++;
        }

        for(char c:s2.toCharArray()){
            if(vowels.indexOf(c)!=-1)
                count2++;
        }

        return count1==count2;
    }
}