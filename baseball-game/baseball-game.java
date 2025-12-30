class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<Integer>();
        int calPoints = 0;
        for(String operation:operations){
            if(operation.equals("C")){
                list.remove(list.size()-1);
            }

            else if(operation.equals("D")){
                int lastNumber = list.get(list.size()-1);
                lastNumber = lastNumber * 2;
                list.add(lastNumber);
            }

            else if(operation.equals("+")){
                int lastNumber = list.get(list.size()-1) + list.get(list.size()-2);
                list.add(lastNumber);
            }

            else{
                list.add(Integer.parseInt(operation));
            }
        }

        for(Integer num:list)
            calPoints = calPoints + num;
        
        return calPoints;
    }
}