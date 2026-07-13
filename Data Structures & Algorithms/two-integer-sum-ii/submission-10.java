class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int leftp = 0;
        int rightp = numbers.length - 1;

        while (leftp < rightp) {

            int sum = numbers[leftp] + numbers[rightp];

            if (sum == target) {
                return new int[]{leftp + 1, rightp + 1};
            }

            if (sum < target) {
                leftp++;
            } else {
                rightp--;
            }
        }

        return new int[]{};
    }
}
