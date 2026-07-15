class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()){
            return false ;
        }

        // Firstly, we compare the first window ...
        int[] s1Frequency = new int[26];
        int[] windowFrequency = new int[26];

    
       
        for (int i=0; i<s1.length(); i++){
            s1Frequency[s1.charAt(i) - 'a']++;
            windowFrequency[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Frequency, windowFrequency)){
            return true;
        }



        // now move to the other respective windows ...
        for (int right = s1.length(); right < s2.length(); right++){

            windowFrequency[s2.charAt(right) - 'a']++;
            int left = right - s1.length();
            windowFrequency[s2.charAt(left) - 'a']--;

            if (Arrays.equals(s1Frequency, windowFrequency)){
                return true;
            }
        }

        return false; 

    }
}
