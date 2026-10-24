class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int smallerCount = 0;
        int targetCount = 0;
        
        // Single loop to find how many elements are smaller, and how many match
        for (int num : nums) {
            if (num < target) {
                smallerCount++;
            } else if (num == target) {
                targetCount++;
            }
        }
        
        // Your idea: Start at the correct position and add indices accordingly
        for (int i = 0; i < targetCount; i++) {
            result.add(smallerCount + i);
        }
        
        return result;
    }
}
