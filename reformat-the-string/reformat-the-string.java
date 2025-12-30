class Solution {
    public String reformat(String s) {
        List<Character> numbersCharacter = new ArrayList<>();
        List<Character> letterCharacter = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        for (Character c : s.toCharArray()) {
            if (c >= '0' && c <= '9')
                numbersCharacter.add(c);

            else if (c >= 'a' && c <= 'z')
                letterCharacter.add(c);
        }

        if (numbersCharacter.size() > letterCharacter.size() + 1
                || numbersCharacter.size() + 1 < letterCharacter.size())
            return "";

        char[] newString = new char[s.length()];
        if (numbersCharacter.size() > letterCharacter.size()) {
            newString[0] = numbersCharacter.get(0);
            j++;
        } else if (numbersCharacter.size() < letterCharacter.size()) {
            newString[0] = letterCharacter.get(0);
            k++;
        } else {
            newString[0] = numbersCharacter.get(0);
            j++;
        }
        i++;
        while (i < s.length()) {
            if (j == numbersCharacter.size() || k == letterCharacter.size())
                break;
            if (newString[i - 1] >= '0' && newString[i - 1] <= '9') {
                newString[i] = letterCharacter.get(k);
                k++;
            } else {
                newString[i] = numbersCharacter.get(j);
                j++;
            }
            i++;
        }

        if (j < numbersCharacter.size()) {
            newString[i] = numbersCharacter.get(j);
        } else if (k < letterCharacter.size()) {
            newString[i] = letterCharacter.get(k);
        }

        return new String(newString);

    }
}