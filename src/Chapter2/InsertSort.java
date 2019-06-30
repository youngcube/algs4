package Chapter2;

public class InsertSort extends SortBase {

    //2 9 5 8 1 6

    @Override
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            Comparable currentElement = a[i];
            int k = 0;
            for (k = i - 1; k>= 0 && less(currentElement, a[k]) ; k--){
                a[k+1]=a[k];
            }
            a[k+1]=currentElement;
        }
    }


//    @Override
//    public void sort(Comparable[] a) {
//        for (int i = 1; i < a.length; i++) { //默认a[0]已经是有序的了，所以从a[1]开始检查
//            //检查新的元素是否比前面的元素小，只要小就交换，直到不小位置，由于前面的已经是有序的了，有一个不小，那前面的都不小
//            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
//                exch(a, j, j-1);
//            }
//        }
//    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        sort.test();
    }
}
