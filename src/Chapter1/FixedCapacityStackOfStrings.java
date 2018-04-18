import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

public class FixedCapacityStackOfStrings {

    private String[] a; // stack entries
    private int N; // size
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(String item){
        a[N++] = item;
    }
    public String pop(){
        return a[--N];
    }


    public static void main(String[] args){

        int[] result = new int[2];
        twoSum(result,5);
//        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
//        while (!StdIn.isEmpty()){
//            String item = StdIn.readString();
//            if (!item.equals("-")){
//                s.push(item);
//            }else if (!s.isEmpty()){
//                StdOut.print(s.pop() + " ");
//            }
//        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}


