package Chapter2;

//冒泡排序
//遍历 N 次数组，每次遍历，比较相邻的数字，如果是降序则交换他们的值，否则保持不变
//由于较小的值像气泡一样逐渐浮到顶部，而较大的值沉向底部，因此叫冒泡排序

public class BubbleSort extends SortBase {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = 0; j < N - i; j++){
                if (less(a[j+1], a[j])){
                    exch(a ,j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.test();
    }
}
