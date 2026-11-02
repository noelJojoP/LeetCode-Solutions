class Solution {
    public int minMoves2(int[] nums) {
        // We first sort the array to get the correct median.
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int median = nums[n/2];
        for(int i = 0 ;i<n;i++)
        {
            // To find the minimum moves for any size array, you calculate the absolute difference between every number and the median.
            moves += Math.abs(nums[i]-median);
        }
        return moves;
    }
}