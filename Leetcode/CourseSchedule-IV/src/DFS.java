import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {
    public static List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            graph.put(i, new ArrayList<>());
        }

        for(int prerequisite[] : prerequisites){
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int query[] : queries){
            ans.add(checkPrerequisite(query[0], query[1], new boolean[numCourses], graph));
        }

        return ans;
    }

    public static Boolean checkPrerequisite(int src, int dest, boolean visited[], Map<Integer, List<Integer>> graph){
        if(src == dest){
            return true;
        }

        visited[src] = true;
        for(int node : graph.get(src)){
            if(!visited[node]){
                if(checkPrerequisite(node, dest, visited, graph)){
                    return true;
                }
            }
        }

        return false;
    }
}
