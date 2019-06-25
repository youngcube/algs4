package Chapter2;

public class InsertSort extends SortBase {

    //2 9 5 8 1 6

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < a.length; i++) {
            Comparable currentElement = a[i];
            int k = 0;
            for (k = i - 1; k>= 0 && less(currentElement, a[k]) ; k--){
                a[k+1]=a[k];
            }
            a[k+1]=currentElement;
        }
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        sort.test();
    }
}
