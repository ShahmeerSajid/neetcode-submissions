class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right=0; right<s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right-left+1);

        }

        return maxLength;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n).  The HashSet may store up to n different characters in the worst case.