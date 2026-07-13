class Solution {
    public boolean isPalindrome(String string) {

        string = string.replace(" ","");
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        char[] array1 = new char [string.length()];
        char[] array2 = new char [string.length()];

        for (int i=0; i<string.length(); i++){
            array1[i] = Character.toLowerCase(string.charAt(i));
        }

        for (int i=string.length()-1; i>=0; i--){
            array2[string.length()-1-i] = Character.toLowerCase(string.charAt(i));
        }

        return Arrays.equals(array1, array2);
    }
}
