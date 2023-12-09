package Prim;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Kruskal {
    static int n;
    static int m;
    static int[] parent = new int[1000];
    public static void init(int n) {
        for(int i = 1 ; i <= n ; i++) {
            parent[i] = i;
        }
    }

    public static int find(int u) {
        if(parent[u] == u) return u;
        return parent[u] = find(parent[u]);
    }

    public static boolean join(int u, int v) {
        u = find(u);
        v= find(v);
        if(u==v) return false;
        parent[u] = v;
        return true;

    }
    static Vector<Edge> edges = new Vector<Edge>();



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 1 ; i <= m ; i++) {
            int u,v,w;
            u = sc.nextInt();
            v= sc.nextInt();
            w= sc.nextInt();
            edges.add(new Edge(u,v,w));
        }
        init(n);

        Collections.sort(edges);
        Vector<Edge> mst = new Vector<Edge>();
        int totalMST = 0;
        for (Edge e : edges) {
            // Nếu không hợp nhất được 2 đỉnh u và v thì bỏ qua
            if (!join(e.u, e.v)) continue;

            // Nếu hợp nhất được u, v ta thêm trọng số cạnh vào kết quả
            totalMST += e.weight;
        }

      System.out.println("totalWeight = "+totalMST );
      for (Edge e : mst) {
          e.printEdge();
      }



    }



}
