class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left<right)
        {
            int width = right - left;
            int length = Math.min(height[left],height[right]);
            int current_area = width * length;
            if(current_area > area)
                area = current_area;
            if(height[left]>height[right])
                right--;
            else if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}