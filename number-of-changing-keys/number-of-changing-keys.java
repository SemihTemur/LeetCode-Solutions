class Solution {
    public int countKeyChanges(String s) {
        int countKeyChanges = 0,i=0;
        String word = s.toUpperCase();
        char[] c = word.toCharArray();
        for (i=0;i<c.length;i++) {
            if(i!=c.length-1 && c[i]!=c[i+1])
                countKeyChanges++;
        }

        return countKeyChanges;
    }
}