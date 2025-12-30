class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] relativeSortArray = new int[arr1.length];
        int index = 0, i = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : arr1){
            countMap.merge(num, 1, Integer::sum);
            list1.add(num);
        }

        for (int num : arr2){
            list2.add(num);
            for (i = 0; i < countMap.get(num); i++)
                relativeSortArray[index++] = num;
        }

        list1.removeAll(list2);

        Collections.sort(list1);
        
        for(int num:list1) relativeSortArray[index++] = num;

        return relativeSortArray;
}
}