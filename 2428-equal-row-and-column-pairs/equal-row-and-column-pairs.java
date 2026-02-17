class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> list1 = new ArrayList<>();
         List<List<Integer>> list2 = new ArrayList<>();
        int i = 0,j=0;
        int count = 0;

        for(i=0;i<grid.length;i++){
            List<Integer> list = new ArrayList<>();
            for(j=0;j<grid.length;j++){
                list.add(grid[i][j]);
            }
            list1.add(list);
        }

         for(i=0;i<grid.length;i++){
            List<Integer> list = new ArrayList<>();
            for(j=0;j<grid.length;j++){
                list.add(grid[j][i]);
            }
            list2.add(list);     
        }

        for(List<Integer> list : list1){
            for(List<Integer> listt:list2){
                if(list.equals(listt))
                    count++;
            }
        }

        return count;
    }

}