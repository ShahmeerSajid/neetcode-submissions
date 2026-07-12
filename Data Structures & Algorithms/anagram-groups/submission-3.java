class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> map = new HashMap<>();

          for (String s: strs){
            char[] characters = s.toCharArray();
            Arrays.sort(characters);

            String sortedWord = new String (characters); 

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList <>()); // if doesnot already exist ...
            }

            map.get(sortedWord).add(s); // add the string to the array list ...
          }

          return new ArrayList<> (map.values());
    }
}
