class Solution {
    public int romanToInt(String s) {
      int result = 0;

    for (int i = 0; i < s.length(); i++) {
        if (i + 1 < s.length()) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                result += 4;
                i++;
            } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                result += 9;
                i++;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                result += 40;
                i++;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                result += 90;
                i++;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                result += 400;
                i++;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                result += 900;
                i++;
            } else {
                result += singleRoman(s.charAt(i));
            }
        } else {
            result += singleRoman(s.charAt(i));
        }
    }

    return result;
}

private int singleRoman(char c) {
    switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
    }
}