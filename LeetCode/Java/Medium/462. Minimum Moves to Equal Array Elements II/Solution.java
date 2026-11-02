class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int moves = 0;
        for(int i = 0 ;i<n;i++)
        {
            moves += Math.abs((nums[i]-nums[n/2]));
        }
        return moves;
    }
}