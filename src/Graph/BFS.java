package Graph;

import java.util.*;

public class BFS {
    private static Stack<Integer>[] adj ;

    private static boolean[] visited;

    BFS() {

        adj = new Stack[1000];
        visited = new boolean[1000];
        for(int i = 0 ; i < 1000; i++) {
            adj[i] = new Stack<>();
        }
        Arrays.fill(visited,false);
    }


    public static void bfs(int u ) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        visited[u] = true;

        while(!q.isEmpty()) {
            int v = q.peek();
            q.poll();
            System.out.print(v + " ");
            for(int x : adj[v]) {
                if(!visited[x]) {
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        new BFS();

        for(int i = 0 ; i < m ; i++) {
            int x = sc.nextInt();
            int y= sc.nextInt();
            adj[x].push(y);
            adj[y].push(x);
        }

        bfs(1);


    }

}
