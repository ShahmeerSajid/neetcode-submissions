class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();

    backtrack(candidates, target, 0, new ArrayList<>(), result);

    return result;
}

private void backtrack(
    int[] candidates,
    int target,
    int start,
    List<Integer> current,
    List<List<Integer>> result
) {
    // Found a valid combination
    if (target == 0) {
        result.add(new ArrayList<>(current));
        return;
    }

    // Target went negative
    if (target < 0) {
        return;
    }

    for (int i = start; i < candidates.length; i++) {

        current.add(candidates[i]);

        // i, NOT i + 1, because we can reuse the same number
        backtrack(
            candidates,
            target - candidates[i],
            i,
            current,
            result
        );

        // Undo the choice
        current.remove(current.size() - 1);
    }
}
}
