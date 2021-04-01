package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class DFS {
     public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //Using a Stack for LIFO (Last in first out )
//        Stack<Integer> dfsStack = new Stack<>();
//        dfsStack.push(0);
//        ArrayList<Integer> dfsTraversal = new ArrayList<>();
//        dfsTraversal.add(0);
//
//        for (int i = 0; i < vertexSize; i++) {
//            for (int j = 0; j < adj.get(i).size(); j++) {
//                if( !dfsTraversal.contains(adj.get(i).get(j)) )
//                dfsTraversal.add(adj.get(i).get(j));
//            }
//        }

//         while(!dfsStack.empty()){
//             int currentNode = dfsStack.peek();
//             dfsTraversal.add(currentNode);
//             dfsStack.pop();
//             visitedArray[currentNode] = true;
//             for (int i = adj.get(currentNode).size() -1 ; i >= 0; i--) {
//                 if(visitedArray[adj.get(currentNode).get(i)]  ) {
//                     dfsStack.push(adj.get(currentNode).get(i));
//                 }
//             }
//         }
        //Find the source Vertex First
        Stack<Integer> dfsStack = new Stack<>();
        ArrayList<Integer> dfsTraversal = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if(adj.get(i).size() > 0){
                dfsStack.push(i);
                break;
            }
        }
        boolean[] visitedArray = new boolean[V];
        //Mark root node as visited
         for (int i = 0; i < visitedArray.length; i++) {
             visitedArray[i] =false;
         }

        visitedArray[dfsStack.peek()] = true;

        while(!dfsStack.empty()) {
            //Current node we are at
            int currentNode = dfsStack.peek();
            dfsStack.pop(); //Get rid of the top node
            dfsTraversal.add(currentNode); //add to list
//            Need to find the neighbours and add in reverse order to the stack
            for (int i = adj.get(currentNode).size() - 1; i >= 0; i--) {
                //Need to check if the node has already been visited
                if (!visitedArray[adj.get(currentNode).get(i)]) {
                    //Add to the stack
                    dfsStack.push(adj.get(currentNode).get(i));
                    //Mark as visited
                    visitedArray[adj.get(currentNode).get(i)] = true;

                }
            }
        }


        return dfsTraversal;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            DFS sol = new DFS();
            ArrayList<Integer> ans = sol.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}