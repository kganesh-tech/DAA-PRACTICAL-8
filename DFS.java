import java.util.*;

public class Main {

    static void DFS(int node, boolean[] visited,
                    ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbour : graph.get(node)) {

            if (!visited[neighbour]) {

                DFS(neighbour, visited, graph);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        System.out.print("DFS Traversal: ");

        DFS(0, visited, graph);
    }
}
