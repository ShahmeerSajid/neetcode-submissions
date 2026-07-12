class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        
        int prefix = 1;
        for (int i=0; i<nums.length; i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
        result[i] *= suffix;
        suffix *= nums[i];
        }
        return result;
    }
}  
