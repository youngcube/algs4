package Chapter2;

import edu.princeton.cs.algs4.Stopwatch;

import static Chapter2.SortBase.genRandomArray;

public class TestCase {
    public static void main(String[] args) {
        Integer[] a = genRandomArray(9999);
        InsertSort insertSort = new InsertSort();
        SelectionSort selectionSort = new SelectionSort();
        Stopwatch stopwatch = new Stopwatch();
        selectionSort.sort(a);
        System.out.println(stopwatch.elapsedTime());
    }
}
