class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums){
            set.add(num);
        }

        int longest = 0;
        int currLength = 0;

        for (int num:set){
            if(!set.contains (num-1)){
                int currentNum = num;
                currLength = 1;

                while (set.contains(currentNum + 1)){
                currentNum = currentNum + 1;
                currLength = currLength + 1;

                }
            }

            longest = Math.max(longest, currLength);
        }

        return longest;

    }
}
