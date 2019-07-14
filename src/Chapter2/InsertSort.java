package Chapter2;


///## 插入排序
//
//插入排序的算法是在已经排好序的子数列中反复插入一个新元素来对数列值进行排序的
//即，对比N次，把小的放左边，如果还小，就一直往左移动
//
//[5]   6   3   1   8   7   2   4
//  ↑   │
//  └───┘
//[5, 6]   3   1   8   7   2   4
//↑        │
//└────────┘
//[3, 5, 6]  1   8   7   2   4
//↑          │
//└──────────┘
//[1, 3, 5, 6]  8   7   2   4
//           ↑  │
//           └──┘
//[1, 3, 5, 6, 8]  7   2   4
//            ↑    │
//            └────┘
//[1, 3, 5, 6, 7, 8]  2   4
//   ↑                │
//   └────────────────┘
//[1, 2, 3, 5, 6, 7, 8]  4
//         ↑             │
//         └─────────────┘
//
//[1, 2, 3, 4, 5, 6, 7, 8]

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
