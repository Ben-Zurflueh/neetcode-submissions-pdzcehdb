class Solution {
    public int maxArea(int[] heights) {
        int maxContainer = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = (width * height);

            if (area > maxContainer) {
                maxContainer = area;
            }

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxContainer;
    }
}
