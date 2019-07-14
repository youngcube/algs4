package Chapter2;

import edu.princeton.cs.algs4.StdOut;

public class MergeSort {
    public static void mergeSort(int[] list){
        if (list.length > 1){
            int[] leftList = new int[list.length / 2];
            System.arraycopy(list, 0, leftList, 0, list.length / 2);
            mergeSort(leftList);

            int rightListLength = list.length - list.length / 2;
            int[] rightList = new int[rightListLength];
            System.arraycopy(list, list.length / 2, rightList, 0, rightListLength);
            mergeSort(rightList);

            int[] temp = merge(leftList, rightList);
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] result = new int[list1.length + list2.length];

        int current1 = 0;
        int current2 = 0;
        int currentResult = 0;

        while (current1 < list1.length && current2 < list2.length){
            if (list1[current1] < list2[current2]){
                result[currentResult++] = list1[current1++];
            }else{
                result[currentResult++] = list2[current2++];
            }
        }

        while (current1 < list1.length){
            result[currentResult++] = list1[current1++];
        }

        while (current2 < list2.length){
            result[currentResult++] = list2[current2++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {2, 9, 5, 8, 1, 6};
        mergeSort(a);

        for (int i =0;i<a.length;i++){
            StdOut.print(a[i] + ",");
        }
        StdOut.println();
    }
}
