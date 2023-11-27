class QUICK_FIND {
    private int [] id ;
    /*
    -Quick find - Union

     */


    /*
       N accesses
       -> INIT_COMPLEXITY = O(n)
     */
    public QUICK_FIND(int N) {
        id = new int[N];
        for(int i = 0 ; i  < N ; i++) {
            id[i] = i;
        }
    }

    /*
       FIND_COMPLEXITY = O(1)
    */
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }


    /*
     UNION_COMPLEXITY : 2 + 2N
   */
    public void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];
        for(int i = 0 ; i < id.length ; i++ ) {
            if(id[i] == pID) id[i] = qID;
        }
    }


}

class QUICK_UNION {
    // Implementation
    /*
    algorithm initialize union find
    quick-find N N 1
    quick-union N N+ N
    => quick-union is worst case
     */
    private int [] id ;

    // O(n)
    QUICK_UNION(int N ) {
        id = new int[N];
        for(int i =  0 ; i<  N  ; i++) {
            id[i] = i;
        }
    }
    private int root(int i) {
        while(i != id[i]) {
            // the id[i] is parent of element at index i
            // so the root = id[id[id[...id[i]]]]
            i= id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q) {
        // if both q and p have the same parent so it connected
        return root(q) == root(p);
    }

    public void union(int p , int  q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}

