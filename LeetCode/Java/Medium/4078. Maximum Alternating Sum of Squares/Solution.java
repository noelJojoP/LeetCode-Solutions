class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int front=0;
        int last = nums.length - 1;
        int counter = 0;
        long result = 0;
        while (front <= last)
        {
            if(counter%2 == 0)
            {
                result += nums[last];
                last--;
            }
            else
            {
                result -= nums[front];
                front++;
            }
            counter++;
        }
        return result;
    }
}