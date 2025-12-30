class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        int i;
        for (i = left; i <= right; i++) {
            if (isSelfDividing(i))
                selfDividingNumbers.add(i);
        }
        return selfDividingNumbers;

    }

    public boolean isSelfDividing(int number){
        int temp = number;
        while(temp !=0){
            int digit = temp % 10;
            temp = temp / 10;
            if(digit == 0 ||number % digit !=0)
                 return false;
        }
        return true;
    }
}