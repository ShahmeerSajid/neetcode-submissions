class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<> ();

        for (int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        List <Map.Entry<Integer, Integer>> all_entries = new ArrayList<> (map.entrySet());
        all_entries.sort(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );

        int[] result_array = new int[k];
        for (int i = 0; i<k; i++){
            result_array[i] = all_entries.get(i).getKey();
        }
        return result_array;
    }
}
