package com.ccmsd.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class CandidateCode {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Graph graph = null;
        int[] map = new int[n + 1];
        graph = new Graph(n);
        int u, v;
        for (int i = 0; i < n - 1; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            graph.addEdge(u, v);
            graph.addEdge(v, u);
        }

        for (int i = 0; i < m; i++) {
            int source = scanner.nextInt();
            int dest = scanner.nextInt();
            Set<Integer> shortestPathList = Graph.shortestPathLength(graph, source, dest);
            shortestPathList.add(source);
            shortestPathList.add(dest);
            for (int q : shortestPathList) {
                map[q] = map[q] + 1;
            }
        }
        System.out.println(Arrays.toString(map));
        System.out.print(Arrays.stream(map).max().getAsInt());
    }
}

class Graph {

    public static ArrayList<Integer>[] adjacencyList = null;
    public int noOfVertices;

    @SuppressWarnings("unchecked")
    public Graph(int noOfVertices) {
        adjacencyList = (ArrayList<Integer>[]) new ArrayList[noOfVertices + 1];
        this.noOfVertices = noOfVertices;
        for (int i = 0; i < (noOfVertices + 1); i++)
            adjacencyList[i] = new ArrayList<Integer>();
    }

    /**
     * @param u
     * @param v
     * @param w
     *              To add edges to the adjacency list in graph
     */
    public void addEdge(int u, int v) {
        if (adjacencyList[u] == null)
            adjacencyList[u] = new ArrayList<Integer>();
        adjacencyList[u].add(v);
    }

    /**
     * Method to verify whether u and v are neighbors
     * 
     * @param u
     * @param v
     * @return
     */
    public boolean isNeighbor(int u, int v) {
        if (adjacencyList[u] == null)
            return false;
        return adjacencyList[u].contains(v);

    }

    /**
     * @param u
     * @return To return the outgoing edges for the given source
     */
    public ArrayList<Integer> getOutEdges(int u) {
        return adjacencyList[u];
    }

    /**
     * Method to return the adjacency list
     * 
     * @return
     */
    public ArrayList<Integer>[] getAdjacencyList() {
        return adjacencyList;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Graph graph = null;
        int[] map = new int[n + 1];
        graph = new Graph(n);
        int u, v;
        for (int i = 0; i < n - 1; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            graph.addEdge(u, v);
            graph.addEdge(v, u);
        }

        for (int i = 0; i < m; i++) {
            int source = scanner.nextInt();
            int dest = scanner.nextInt();
            Set<Integer> shortestPathList = shortestPathLength(graph, source, dest);
            shortestPathList.add(source);
            shortestPathList.add(dest);
            for (int q : shortestPathList) {
                map[q] = map[q] + 1;
            }
        }
        // System.out.println(Arrays.toString(map));

        System.out.print(Arrays.stream(map).max().getAsInt());
    }

    public static Set<Integer> shortestPathLength(Graph graph, Integer source, Integer target) {
        Map<Integer, Integer> dist = new HashMap<Integer, Integer>();
        Map<Integer, Integer> prev = new HashMap<Integer, Integer>();
        Queue<Integer> q = new LinkedList<>();

        dist.put(source, 0);
        prev.put(source, null);
        q.offer(source);

        while (!q.isEmpty()) {
            Integer u = q.poll();
            if (u == target)
                return tracebackPath(u, prev);
            q.remove(u);
            ArrayList<Integer>[] s = graph.getAdjacencyList();
            for (Integer neighbor : s[u]) {
                if (!dist.containsKey(neighbor)) {
                    dist.put(neighbor, dist.get(u) + 1);
                    prev.put(neighbor, u);
                    q.offer(neighbor);
                }
            }
        }

        return null; // Target not reachable from source.
    }

    static Set<Integer> tracebackPath(Integer target, Map<Integer, Integer> prev) {
        Set<Integer> s = new HashSet<Integer>();
        Integer u = target;
        while (prev.get(u) != null) {
            s.add(u);
            u = prev.get(u);
        }
        return s;
    }

}
