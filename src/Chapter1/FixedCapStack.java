import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class FixedCapStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1]; // array to store
    private int N = 0; // size of stack


    private boolean isFull(){
        return a.length == N;
    }

    private void resize (int cap){
        Item[] temp = (Item[]) new Object[cap];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public void remove() {StdOut.print();}
        public Item next(){ return  a[--i]; }
        public boolean hasNext() {return  i > 0;}
    }

    public int size(){
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item){
        if (isFull()){
            resize(N * 2);
        }
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        return item;
    }

    public Item peak(){
        int num = N - 1;
        return a[num];
    }

    public static void main (String[] args){
        FixedCapStack<String> stack = new FixedCapStack<String>();

        while (!StdIn.isEmpty()){
            stack.push(StdIn.readString());
        }

        Iterator<String> i = stack.iterator();
        while (i.hasNext()){
            String s = i.next();
            StdOut.println(s);
        }


        for (String s: stack) {
            StdOut.println(s);
        }

    }

}
