class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWithCandies = new ArrayList<>();
        int maxCandies = 0;

        for (int candie : candies) {
            if (maxCandies < candie)
                maxCandies = candie;
        }

        for (int candie : candies) {
            int value = candie + extraCandies;
            if (value >= maxCandies)
                kidsWithCandies.add(true);
            else
                kidsWithCandies.add(false);
        }

        return kidsWithCandies;
    }
}