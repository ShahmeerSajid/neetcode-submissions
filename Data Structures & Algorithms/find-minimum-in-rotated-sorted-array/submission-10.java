class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right){

            int mid = left + (right - left)/2;
            if (nums[mid] > nums[right]){

                 // Minimum must be to the RIGHT of mid
                left = mid + 1;
            }

            // mid could itself be the minimum
            else {
                right = mid;
            }
            
        }

        return nums[left];
    }
}
