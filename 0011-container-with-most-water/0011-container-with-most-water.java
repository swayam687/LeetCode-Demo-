class Solution {
    public int maxArea(int[] height) {

        // Start from both ends
        int left = 0;
        int right = height.length - 1;

        // Store the biggest area found so far
        int max = 0;

        while(left < right) {

            // Distance between the two lines
            int w = right - left;

            // Water level is limited by the shorter line
            int h = Math.min(height[left], height[right]);

            // Calculate current container area
            int area = h * w;

            // Update maximum area
            max = Math.max(max, area);

            // Move the shorter wall
            if(height[left] < height[right]) {
                left++;
            }

            else if(height[left] > height[right]) {
                right--;
            }

            // Both walls have same height
            else {
                left++;
                right--;
            }
        }

        return max;
    }
}