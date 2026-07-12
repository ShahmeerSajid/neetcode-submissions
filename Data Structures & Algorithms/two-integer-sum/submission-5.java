class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int needed = target - nums[i];

            if (map.containsKey(needed)){
                int [] arr = {map.get(needed), i};
                return arr;
            }
            map.put(nums[i], i); 
            // Space Complexity is O(n). 
            // In the worst case, we may store almost all n elements inside t before finding the answer.
            // So the extra space grows with the number of elements.
        }
        
        int[] arr = {};
        return arr;
    }
}
