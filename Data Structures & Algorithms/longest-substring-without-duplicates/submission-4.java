class Solution {
    public int lengthOfLongestSubstring(String s) {

        int leftp = 0;
        

        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int rightp=0; rightp<s.length(); rightp++){

            while(set.contains(s.charAt(rightp))){
                set.remove(s.charAt(leftp));
                leftp++;
            }

            set.add(s.charAt(rightp));

            maxLength = Math.max(maxLength, rightp-leftp+1);
        }

        return maxLength;
        
        }

 }


// Time Complexity: O(n)
// Space Complexity: O(n).  The HashSet may store up to n different characters in the worst case.