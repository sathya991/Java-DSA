import java.util.*;

public class BFS {
    // public class Graph{

    // }
    public static void main(String[] args){
        int[] nodes = {0,1,2,3,4};
        Map<Integer,List<Integer>> adjacencyList = new HashMap<>();
        adjacencyList.put(0, Arrays.asList(3));
        adjacencyList.put(1, Arrays.asList(2,3,4));
        adjacencyList.put(2, Arrays.asList(1));
        adjacencyList.put(3, Arrays.asList(0,1));
        adjacencyList.put(4, Arrays.asList(1));
        Map<Integer,Boolean> visitedList = new HashMap<>();
        visitedList.put(0, false);
        visitedList.put(1, false);
        visitedList.put(2, false);
        visitedList.put(3, false);
        visitedList.put(4, false);
        bfsAlgo(adjacencyList, visitedList, nodes);
    }
    public static void bfsAlgo(Map<Integer,List<Integer>> adjacencyList, Map<Integer,Boolean> visitedList,int[] nodes){
        Queue<Integer> q = new LinkedList<>();
        List<Integer> traversalList = new ArrayList<>();
        for(int i = 0;i < nodes.length;i++){
            if(q.isEmpty()){
                q.add(nodes[i]);
            }
             while(!q.isEmpty()){
                int el = q.remove();
                if(!visitedList.get(el)){
                    q.add(el);
                    visitedList.put(el, true);
                    List<Integer> l = adjacencyList.get(el);
                    for(int k = 0;k < l.size();k++){
                      if(!visitedList.get(l.get(k))){
                        q.add(l.get(k));
                      }
                    }
                    traversalList.add(el);
                }
             }
        }
        System.out.println(traversalList);
    }
}
