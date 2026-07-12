class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries =
                new ArrayList<>(map.entrySet());

        entries.sort(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;

        
    }
}
