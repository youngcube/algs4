package Chapter1;
/**
 * Created by cube on 21/06/2017.
 */
import edu.princeton.cs.algs4.*;

public class Selection {
    public static double time(String alg, Comparable[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insert")) insertSort(a);
        if (alg.equals("Select")) selectionSort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void selectionSort(Comparable[] a) {
        int N = a.length;
        // 将a[i] 和 a[i+1]中的最小元素交换
        for (int i = 0; i < N; i++) {
            int min = i; // 最小元素的索引，假设是第0个
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }

    public static void insertSort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j >0 && less(a[j],a[j-1]); j--) {
                exch(a, j ,j-1);
            }
        }
    }

    // 判断是否前者小于后者
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    // 判断是否前者大于后者（用于倒叙排列）
    public static boolean more(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String alg1 = "Insert";
        String alg2 = "Select";
        int N = 1000;
        int T = 100;

        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        StdOut.printf("For %d random Doubles\n %s is",N, alg1);
        StdOut.printf("%.1f times faster than %s\n",t2/t1, alg2);






//        StdOut.println("Please input something");
//        Comparable[] a = In.readStrings();
//        StdOut.println("Running");
//        insertSort(a);
//        assert isSorted(a);
//        show(a);



//        int N = 50;
//        double[] a = new double[N];
//        for (int i = 0; i < N; i++) {
//            a[i] = StdRandom.random();
//        }
//        for (int i = 0; i < N; i++) {
//            double x = 1.0 * i / N;
//            double y = a[i] / 2.0;
//            double rw = 0.5 / N;
//            double rh = a[i] / 2.0;
//            StdDraw.filledRectangle(x,y,rw,rh);
//        }

    }


}
