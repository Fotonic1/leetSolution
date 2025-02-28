import java.util.*;

public class P207 {


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 1) return true;

        Set<Integer>[] courses = new HashSet[numCourses];

        for (int i = 0; i < courses.length; i++) {
            courses[i] = new HashSet<>();
        }

        for (int[] prerequisite : prerequisites) {
            courses[prerequisite[0]].add(prerequisite[1]);

            if (courses[prerequisite[1]].contains(prerequisite[0])) {
                return false;
            }
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] dfs = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!noCircle(courses, visited, i, dfs)){
                return false;
            }
        }

        return true;
    }

    private boolean noCircle(Set<Integer>[] courses, boolean[] visited, int course, boolean[] dp){
        if(visited[course])
            return dp[course];
        else
            visited[course] = true;

        for(Integer c: courses[course]){
            if(!noCircle(courses, visited, c, dp)) {
                dp[course] = false;
                return false;
            }
        }

        dp[course] = true;
        return true;
    }

    public static void main(String[] args) {
    }

}
