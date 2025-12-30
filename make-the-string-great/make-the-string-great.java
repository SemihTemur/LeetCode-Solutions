class Solution {
    public String makeGood(String s) {
        int i, j;
        StringBuilder sb = new StringBuilder();
        List<Character> character = new ArrayList<>();

        for (Character c : s.toCharArray()) {
            character.add(c);
        }

        for (i = 0; i < character.size()-1; i++) {
            if (Math.abs(character.get(i) - character.get(i + 1)) == 32) {
                character.remove(i+1);
                character.remove(i);
                i=-1;
            }
        }

        for (Character c : character)
            sb.append(c);

        return sb.toString();
    }
}