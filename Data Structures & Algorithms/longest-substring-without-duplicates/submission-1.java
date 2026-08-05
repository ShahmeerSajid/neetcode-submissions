class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet <Character> set = new HashSet<> ();

        int leftp = 0;
        
        int maxLength = 0;

        for (int rightp=0; rightp < s.length(); rightp++){

            while (set.contains(s.charAt(rightp))){
                set.remove(s.charAt(leftp));
                leftp ++;
            }
            set.add(s.charAt(rightp));

            int currLen = rightp - leftp + 1;
            maxLength = Math.max(currLen, maxLength);
        }

        return maxLength;

    }
}
