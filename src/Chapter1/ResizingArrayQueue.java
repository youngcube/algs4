import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;

public class ResizingArrayQueue<Item> {
    private Item[] array;
    private int first;
    private int last;
    private int n;
    private void resize(int capacity) {
        assert capacity >= n;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = array[(first + i) % array.length];
        }
        array = temp;
        first = 0;
        last  = n;
    }

    private boolean isFull(){
        return n == array.length;
    }

    public ResizingArrayQueue(){
        array = (Item[]) new Object[2];
        first = 0;
        last = 0;
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void enqueue(Item a){

        if (isFull()){
            resize(array.length * 2);
        }
        array[last++] = a;
        if (last == array.length) last = 0;
        n++;
    }

    public Item dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        Item a = array[first];
        first++;
        n--;
        return a;
    }

    public static void main(String[] args){
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<String >();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("-")) StdOut.println(queue.dequeue());
            else queue.enqueue(s);
        }
    }
}
