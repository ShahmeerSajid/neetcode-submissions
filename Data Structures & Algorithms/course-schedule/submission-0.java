class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre = prerequisite[1];

            graph.get(pre).add(course);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {

            if (!dfs(i, graph, visited, path)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(
        int course,
        List<List<Integer>> graph,
        boolean[] visited,
        boolean[] path
    ) {

        if (path[course]) {
            return false;
        }

        if (visited[course]) {
            return true;
        }

        visited[course] = true;
        path[course] = true;

        for (int next : graph.get(course)) {

            if (!dfs(next, graph, visited, path)) {
                return false;
            }
        }

        path[course] = false;

        return true;
    }
}