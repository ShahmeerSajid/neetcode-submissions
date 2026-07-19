class Solution {
    public int characterReplacement(String s, int k) {

        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            frequency[index]++ ;

            maxFrequency = Math.max(
                maxFrequency,
                frequency[index]
            );

            int windowLength = right - left + 1;

            while (windowLength - maxFrequency > k) {

                int leftIndex = s.charAt(left) - 'A';

                frequency[leftIndex]--;

                left++;

                windowLength = right - left + 1;
            }

            longest = Math.max(longest, windowLength);
        }

        return longest;

    }

}
