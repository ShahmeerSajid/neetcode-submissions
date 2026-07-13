class Solution {
    public int longestConsecutive(int[] nums) {

        Set <Integer> set = new HashSet<>();

        int longestLength = 0;
        int currentLength = 0;

        for (int num: nums){
            set.add(num);
        }

        for (int num:set){

            // it means that we are starting a sequence ... as the number is not already inside the sequence.
            if (!set.contains(num-1)){

                int currentNum = num;
                currentLength = 1;

                while (set.contains(currentNum+1)){
                    currentNum = currentNum + 1;
                    currentLength = currentLength + 1;
                }

                longestLength = Math.max(longestLength, currentLength);


            }

        }
        return longestLength; 
        
    }
}
