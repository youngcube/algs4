package Chapter2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public abstract class SortBase implements SortInterface {
    public void sort(Comparable[] a){

    }

    public final boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public final void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public final void show(Comparable[] a)
    {
        for (int i =0;i<a.length;i++){
            StdOut.println(a[i] + "");
        }
        StdOut.println();
    }

    public final boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public Integer[] genRandomArray(int m , int n) {
        if(m<=0) return null;
        if(n<=0) return null;
        if(m< n) return null;

        Integer[] intRet = new Integer[n];
        int intRd = 0; // 存放随机数
        int count = 0; // 记录生成的随机数个数
        boolean flag = false;  // 是否已经生成过标志
        while(count< n){
            Random rdm = new Random(System.currentTimeMillis());
            intRd = Math.abs(rdm.nextInt())%m +1;
            for(int i=0;i<count;i++){
                if(intRet[i]==intRd){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if(!flag){
                intRet[count] = intRd;
                count++;
            }
        }
        return intRet;
    }

    public void test(){
        Integer[] a = genRandomArray(9999, 10);
        this.sort(a);
        assert this.isSorted(a);
        this.show(a);
    }
}
