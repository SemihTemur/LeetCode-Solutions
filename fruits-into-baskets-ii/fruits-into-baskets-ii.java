class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> fruitList = new ArrayList<>();
        List<Integer> basketList = new ArrayList<>();
        int i = 0, j = 0;

        for (int num : fruits)
            fruitList.add(num);

        for (int num : baskets)
            basketList.add(num);

        for (i = 0; i < fruitList.size(); i++) {
            for (j = 0; j < basketList.size(); j++) {
                if (fruitList.get(i) <= basketList.get(j)) {
                    fruitList.remove(i);
                    basketList.remove(j);
                    i = -1;
                    break;
                }
            }
        }
        return basketList.size();
    }
}