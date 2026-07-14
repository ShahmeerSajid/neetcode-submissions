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

        // You move the shorter line because it is limiting the area!!!

        // Moving the taller line would reduce the width while keeping the same shorter height, 
        // so the area cannot improve. 

            if (heights[leftp] < heights[rightp]) {
                leftp++;
            }

            else {
                rightp--;
            }

        }

        return maxArea;

    }
}

// The container height is limited by the shorter line:
// min(3,8)=3
// If you move the taller line (8), the width decreases, but the height is still limited by 3. So the area cannot improve.
// But if you move the shorter line (3), you might find a taller line, perhaps 6, which could compensate for the reduced width and give a larger area.
// }



