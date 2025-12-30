class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for(int n:num){
            sb.append(n);
        }

        char[] num1 = sb.toString().toCharArray();
        char[] num2 = String.valueOf(k).toCharArray();

        List<Integer> addToArrayForm = new ArrayList<Integer>();
        
      
        int i = num1.length - 1;
        int j = num2.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? num1[i] - '0' : 0;
            int y = (j >= 0) ? num2[j] - '0' : 0;

            int sum = x + y + carry;
            addToArrayForm.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }


        Collections.reverse(addToArrayForm);

        return addToArrayForm;
    }
}