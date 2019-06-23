package Chapter2;

public class SelectionSort extends SortBase implements SortInterface {
    @Override
    public void sort(Comparable[] a) {

        for (int i = 0; i < a.length; i++){
            Comparable currentMin = a[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < a.length; j++){
                if (!less(currentMin, a[j])){
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }

//        int N = a.length;
//        for (int i = 0; i < N; i++) {
//            int min = i;
//            for (int j = i + 1; j < N; j++) {
//                if (less(a[j], a[min])){
//                    min = j;
//                }
//                exch(a, i, min);
//            }
//        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.test();
    }
}
