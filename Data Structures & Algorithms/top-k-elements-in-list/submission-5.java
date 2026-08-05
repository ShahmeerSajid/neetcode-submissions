class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer, Integer> map = new HashMap<> ();
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> all_entries = new ArrayList<>(map.entrySet());
        all_entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] result = new int[k];
        for (int i=0; i<k; i++){
            result[i] = all_entries.get(i).getKey();
        }

        Arrays.sort(result);
        return result;
    }
}
