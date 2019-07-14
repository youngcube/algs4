package Chapter2;

//选择排序
//找到元素中最小的那个元素，将它和第一个元素交换位置（如果第一个元素就是最小元素，那么它就和自己交换）
//……
//这样既可完成排序
public class SelectionSort extends SortBase implements SortInterface {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++){
            int min = i; //这里记录最小元素的索引
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a ,i, min);
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.test();
    }
}
