package Graph;

import java.util.*;

public class DFS {

    private static Stack<Integer>[] adj ;

    private static boolean[] visited;

    DFS() {

        adj = new Stack[1000];
        visited = new boolean[1000];
        for(int i = 0 ; i < 1000; i++) {
            adj[i] = new Stack<>();
        }
        Arrays.fill(visited,false);
    }
    public static void dfs(int u) {
        System.out.print(u+" ");
        visited[u] = true;

        for(int v : adj[u]) {
            if(!visited[v]) {
                dfs(v);
            }
        }


    }

    public static void bfs(int u ) {

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        new DFS();

        for(int i = 0 ; i < m ; i++) {
            int x = sc.nextInt();
            int y= sc.nextInt();
           adj[x].push(y);
           adj[y].push(x);
        }

        dfs(1);

    }
}
