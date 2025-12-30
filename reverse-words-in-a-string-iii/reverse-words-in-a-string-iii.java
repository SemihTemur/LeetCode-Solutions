class Solution {
    public String reverseWords(String s) {
        String[] arrays = s.split(" ");
        String reverseWords = "";
        int i;

        for(i=0;i<arrays.length;i++){
            char[] c = arrays[i].toCharArray();
            int j= c.length-1;
            int k = 0;
            while(k<j){
                char temp = c[k];
                c[k] = c[j];
                c[j] = temp;
                j--;
                k++; 
            }
            arrays[i] = new String(c);
        }

        for(i=0;i<arrays.length;i++){
            if(i==arrays.length -1)
                reverseWords = reverseWords + arrays[i];
            else
                reverseWords = reverseWords + arrays[i] + " ";
        }

        return reverseWords;
        
    }
}