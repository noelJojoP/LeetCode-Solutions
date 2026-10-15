class Solution {
    public int sumCounts(List<Integer> nums) {
        int total = 0;
        int n = nums.size();
        for(int i = 0;i < n;i++)
        {
            HashSet<Integer> distinctset = new HashSet<>();
            for(int j = i;j < n;j++)
            {
                distinctset.add(nums.get(j));
                int distinct_count= distinctset.size();
                total += (distinct_count*distinct_count);
            }
        }
        return total;
    }
}