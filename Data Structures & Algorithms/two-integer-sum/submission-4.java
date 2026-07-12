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
        }
        int[] arr = {};
        return arr;
    }
}
