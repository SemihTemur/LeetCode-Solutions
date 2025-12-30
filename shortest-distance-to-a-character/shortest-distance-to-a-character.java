class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<Integer>();
        char[] ch = s.toCharArray();
        int i = 0, j = 0;

        for (i = 0; i < ch.length; i++) {
            if (ch[i] == c)
                list.add(i);
        }

        int[] shortestToChar = new int[ch.length];

        for (i = 0; i < ch.length; i++) {
            int minumumDistance = Integer.MAX_VALUE;
            for (j = 0; j < list.size(); j++) {
                int distance = Math.abs(list.get(j) - i);
                minumumDistance = Math.min(distance, minumumDistance);
            }
            shortestToChar[i] = minumumDistance;
        }

        return shortestToChar;
    }
}