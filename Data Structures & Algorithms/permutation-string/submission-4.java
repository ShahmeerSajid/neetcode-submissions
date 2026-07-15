class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()){
            return false;
        }

        int[] s1Frequency = new int[26];
        int[] windowFrequency = new int[26];

        // Compare the first window only right now ...
        for (int right = 0; right < s1.length(); right++){
            s1Frequency[s1.charAt(right) - 'a'] ++;
            windowFrequency[s2.charAt(right) - 'a'] ++;
        }

        if (Arrays.equals(s1Frequency, windowFrequency))
        {
            return true;
        }


        // Now compare the other windows ...

        // right pointer starts from s1.length();
        for (int right = s1.length(); right<s2.length(); right++){

            windowFrequency[s2.charAt(right) - 'a'] ++;

            int left = right - s1.length(); // left pointer

            windowFrequency[s2.charAt(left) - 'a']--;

            if (Arrays.equals(s1Frequency, windowFrequency)){
                return true;
            }
        }

        return false;
        
    }
}
