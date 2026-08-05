class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for (int i=0; i<s.length(); i++){
            array1[s.charAt(i) - 'a']++;
        }

        for (int i=0; i<t.length(); i++){
            array2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(array1, array2);
    }
}
