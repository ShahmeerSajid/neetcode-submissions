class Solution {


    public boolean isAnagram(String s, String t) {

        int[] arr1 = new int [26];
        int[] arr2 = new int [26];

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        for (char s1 : string1) {
            arr1[s1 - 'a'] ++ ; 
        }        

        for (char s2 : string2) {
            arr2[s2 - 'a'] ++ ;
        }

        return java.util.Arrays.equals(arr1, arr2);
    }
}
