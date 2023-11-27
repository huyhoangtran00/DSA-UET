import java.util.*;


public class HeapAndPriorityQueue {
   public static List<Character> list = new ArrayList<>();

   public static boolean less (int a, int b) {
       return a < b;
   }

    public static void swim(int k) {
        while( k> 1 && list.get(k/2) < list.get(k)) {
            Collections.swap(list,k/2,k);
            k = k/2;

        }
    }

    public static void insert(Character x) {
        int k = list.size();
        list.add(x);

        swim(k);
    }

    public static void sink(int k) {
        while(2* k < list.size()) {
                int j = 2 * k;
                if(j <  list.size() && less(list.get(j),list.get(j+1))) j++;
                if(!less(list.get(k),list.get(j)) ) break;
                Collections.swap(list,k,j);
                k = j;
        }
    }

    public static void delMax() {
       Character max = list.get(1);
       Collections.swap(list,1,list.size()-1);
       list.remove(list.size()-1);
       sink(1);


    }

    //heapsort max-heap

    public static void heapSort() {
       for(int k = list.size()/2 ; k >=1 ; k--) {
           sink(k);
       }
       int n = list.size();
       while (n > 1) {
           Collections.swap(list,1,n-1);
           sink(1);
           n--;
       }
    }

    public static void main(String[] args) {
       list.add('S');
       list.add('S');
       list.add('O');
       list.add('R');
       list.add('T');
       list.add('E');
       list.add('X');
       list.add('A');
        list.add('M');
        list.add('P');
        list.add('L');
        list.add('E');
        for(int i = 1 ; i < list.size() ; i++) {
            sink(i);
        }

        heapSort();

       for(int i = 1 ; i < list.size() ; i++) {
           System.out.println(list.get(i));
       }


    }
}
// event-driven simulation - must learn