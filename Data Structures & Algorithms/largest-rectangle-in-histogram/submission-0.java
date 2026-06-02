class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];


            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int poppedIndex = stack.pop();
                int h = heights[poppedIndex];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = h * width;
                maxArea = Math.max(maxArea, area);
            } 

            stack.push(i);
        }

        return maxArea;
    }
}
