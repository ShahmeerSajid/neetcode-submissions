class Solution {
    public int findMin(int[] nums) {

        // rotating array 4 times moves the last 4 elements of the array
        // to the beginning 

        int left = 0;
        int right = nums.length - 1;

        while (left < right){

            int mid = left + (right - left)/2;

            if (nums[mid] > nums[right]){
                left = mid + 1;
            }

            else {
                right = mid;
            }


        }

        return nums[left];

    }
}
