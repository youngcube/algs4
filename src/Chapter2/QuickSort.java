package Chapter2;

public class QuickSort extends SortBase {
    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public void sort(Comparable[] a, int low, int high){
        if (high <= low){
            return;
        }
        int j = partition(a, low, high);
        sort(a, low, j-1);
        sort(a, j+1, high);

    }

    public int partition(Comparable[] a, int low, int high){
        int i = low;
        int j = high + 1;
        Comparable v = a[low];
        while (true){
            while (less(a[++i], v)){
                if (i == high){
                    break;
                }
            }

            while (less(v, a[--i])){
                if (j == low){
                    break;
                }
            }

            if (i >= j){
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        sort.test();
    }
}
