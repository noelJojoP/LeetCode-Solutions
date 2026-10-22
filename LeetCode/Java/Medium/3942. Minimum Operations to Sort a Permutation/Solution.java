class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        // Find the index of the number 0
        int zeroIdx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIdx = i;
                break;
            }
        }
        
        // Check if it's a valid cyclic climbing array
        int climbBreaks = 0;
        for (int i = 0; i < n; i++) {
            if (nums[(i + 1) % n] != (nums[i] + 1) % n) {
                climbBreaks++;
            }
        }
        boolean isClimbing = (climbBreaks <= 1);
        
        // Check if it's a valid cyclic sliding array
        int slideBreaks = 0;
        for (int i = 0; i < n; i++) {
            if (nums[(i + 1) % n] != (nums[i] - 1 + n) % n) {
                slideBreaks++;
            }
        }
        boolean isSliding = (slideBreaks <= 1);
        
        // If it fits neither pattern, it's completely impossible
        if (!isClimbing && !isSliding) {
            return -1;
        }
        
        // Check if the array is already perfectly sorted from the start
        if (isClimbing && zeroIdx == 0) {
            return 0;
        }
        
        // Calculate the minimum operations using our formula grids
        if (isClimbing) {
            return Math.min(zeroIdx, n - zeroIdx + 1);
        } else {
            return Math.min(zeroIdx + 2, n - zeroIdx);
        }
    }
}