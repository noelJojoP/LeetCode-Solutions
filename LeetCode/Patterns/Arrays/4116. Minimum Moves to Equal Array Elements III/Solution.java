class Solution {
    public int minMoves(int[] nums) {
        int size = nums.length;
        int maxvalue = 0;
        int sum = 0;
        for(int i:nums)
        {
            if(i>maxvalue)
                maxvalue = i;
            sum += i;
        }
        // Minimum moves = ( maxvalue(in array) * size(of array) - sum (of all values in array))
        int minimum_moves = (int)((long)maxvalue*size - sum);
        return minimum_moves;
    }
}