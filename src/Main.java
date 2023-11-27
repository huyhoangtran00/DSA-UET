import java.util.*;


public class Main {
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
       for(i)
    }

    public static void main(String[] args) {
       list.add('S');
       list.add('T');
       list.add('H');
       list.add('R');
       list.add('P');
       list.add('S');
       list.add('O');
       list.add('A');
        list.add('E');
        list.add('I');
        list.add('N');
        list.add('G');
        for(int i = 1 ; i < list.size() ; i++) {
            sink(i);
        }

       for(int i = 1 ; i < list.size() ; i++) {
           System.out.println(list.get(i));
       }


    }
}