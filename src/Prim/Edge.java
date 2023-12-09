package Prim;

public class Edge implements Comparable<Edge> {
    public int v;
    public int u;
    public int weight;

    public Edge(int v, int w, int weight) {
        this.v = v;
        this.u = w;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.weight,o.weight);
    }

    public void printEdge() {
        System.out.println(v+" "+ u+ " "+ weight);
    }
}
