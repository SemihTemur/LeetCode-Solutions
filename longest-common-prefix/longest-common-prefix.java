class Solution {
    public String longestCommonPrefix(String[] strs) {
        char common, temp;
        String answer = "";
        int i = 0, j;
        int enkısa = strs[0].length();
        int flag = 0;
        for (i = 0; i < strs.length; i++) {
            if (enkısa > strs[i].length()) {
                enkısa = strs[i].length();
            }
        }

        i = 0;

        while (i < enkısa) {
            common = strs[0].charAt(i);
            for (j = 0; j < strs.length; j++) {
                temp = strs[j].charAt(i);
                if (common == temp) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                answer += common;
            }
            else{
                break;
            }

            i++;
        }

        return answer;
    }
}