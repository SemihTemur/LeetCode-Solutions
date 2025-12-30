class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1=0,num2=0,result=0;

        for(char c:firstWord.toCharArray()){
            int temp = c-'a';
            num1 = (num1*10)+temp;
        }

        for(char c:secondWord.toCharArray()){
            int temp = c-'a';
            num2 = (num2*10)+temp;
        }

         for(char c:targetWord.toCharArray()){
            int temp = c-'a';
            result = (result*10)+temp;
        }

        return num1+num2==result ? true:false;
    }
}