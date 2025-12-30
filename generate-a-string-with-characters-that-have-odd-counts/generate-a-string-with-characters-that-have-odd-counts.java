class Solution {
    public String generateTheString(int n) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(i=1;i<=n-1;i++){
            sb.append('a');
        }
        if(n%2==0)
            sb.append('b');
        else
            sb.append('a');
        return sb.toString();
    }
}