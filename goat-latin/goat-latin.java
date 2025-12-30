class Solution {
    public String toGoatLatin(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        String vowels = "aAeEiIoOuU";
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < sentenceArray.length; i++) {
            String indexWord = sentenceArray[i];
            if (vowels.indexOf(indexWord.charAt(0)) == -1) {
                char[] c = indexWord.toCharArray();
                int j = 0;
                char firstChar = c[0];

                for (j = 0; j < c.length - 1; j++) {
                    c[j] = c[j + 1];
                }

                c[c.length - 1] = firstChar;

                indexWord = new String(c);
            }

            String addMa = "ma";
            int j = 0;
            while (j <= i) {
                addMa = addMa + "a";
                j++;
            }
            if (i == sentenceArray.length - 1)
                sb.append(indexWord + addMa);
            else
                sb.append(indexWord + addMa + " ");

            addMa = "ma";
        }

        return sb.toString();
    }
}