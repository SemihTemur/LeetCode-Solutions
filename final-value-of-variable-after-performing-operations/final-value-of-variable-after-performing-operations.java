class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalValueAfterOperations = 0,i=0;
        for(i=0;i<operations.length;i++){
            if(operations[i].indexOf('+')!=-1)
                finalValueAfterOperations++;
            else
                finalValueAfterOperations--;
        }

        return finalValueAfterOperations;
    }
}