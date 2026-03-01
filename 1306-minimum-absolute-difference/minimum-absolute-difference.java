class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> minimumAbsDifference = new ArrayList<>();
        Arrays.sort(arr);

        int minDifference = Math.abs(arr[0]-arr[1]);
        int i = 0;

        for(i = 0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==minDifference)
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i+1])));
            else if(Math.abs(arr[i]-arr[i+1])<minDifference){
                minDifference = Math.abs(arr[i]-arr[i+1]);
                minimumAbsDifference.clear();
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i+1])));
            }
        }

        return minimumAbsDifference;
    }
}