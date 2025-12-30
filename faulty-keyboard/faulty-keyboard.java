class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            if(c=='i'){
                sb = reverseString(sb.toString());
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }

      public static StringBuilder reverseString(String reverseSt){
            int left = 0;
            int right = reverseSt.length() -1;
            char[] chars = reverseSt.toCharArray();
            while(left<right){
                char c = chars[left];
                chars[left] = chars[right];
                chars[right] = c;
                left++;
                right --;
            }
            return new StringBuilder(new String(chars));
        }
}