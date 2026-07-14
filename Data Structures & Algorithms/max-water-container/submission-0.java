class Solution {
    public int maxArea(int[] heights) {

        int maxArea = 0;
        int currArea = 0;
        int leftp = 0;
        int rightp = heights.length-1;

        while (leftp < rightp){
            int height = Math.min(heights[leftp], heights[rightp]);
            int width = rightp - leftp;
            currArea = height * width;

            maxArea = Math.max(currArea, maxArea);

            if(heights[leftp] < heights[rightp]){
                leftp++;
            }
            else{
                rightp--;
            }
        }
        return maxArea;
    }
}
