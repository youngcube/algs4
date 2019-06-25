package Chapter2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public abstract class SortBase implements SortInterface {
    public void sort(Comparable[] a){

    }

    public final boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public final void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public final void show(Comparable[] a)
    {
        for (int i =0;i<a.length;i++){
            StdOut.println(a[i] + "");
        }
        StdOut.println();
    }

    public final boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static Integer[] genRandomArray(int m) {
        Integer[] result = new Integer[m];
        for (int i = 0; i < m; i++) {
            result[i] = StdRandom.uniform(m);
        }
        return result;
    }

    public void test(){
//        Integer[] a = genRandomArray(9999, 10);
        Integer[]a = {2, 9, 5, 8, 1, 6};
        this.sort(a);
        assert this.isSorted(a);
        this.show(a);
    }
}
