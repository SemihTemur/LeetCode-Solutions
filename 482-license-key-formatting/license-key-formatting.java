class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase().replace("-", "");
        StringBuilder sb = new StringBuilder();

        int i = 0;

        int remainder = s.length() % k;

        while (i < remainder) {
            sb.append(s.charAt(i));
            i++;
        }

        if (remainder != 0 && i<s.length())
            sb.append("-");

        int count = 0;
        for (; i < s.length(); i++) {
            if (count == k) {
                sb.append("-");
                count = 0;
            }
            sb.append(s.charAt(i));
            count++;
        }

        return sb.toString();
    }
}