class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            int num = c-'a' +1;
            sb.append(num);
        }

        int value = 0;
        for(char c:sb.toString().toCharArray()){
            int num = c-'0';
            value = value + num;
        }

        int index = 1;
        while(index<k){
            int temp = value;
            int result = 0;
            while(temp!=0){
                result = result + temp % 10;
                temp = temp / 10;
            }
            value = result;
            index++;
        }
        return value;
    }
}