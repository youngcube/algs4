import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LineQueue <Item> implements Iterable<Item> {
    private class Node<Item>{
        Node<Item> next;
        Item item;
    }
    private int N; // size
    private Node<Item> first;
    private Node<Item> last;
    private boolean isEmpty() { return N == 0; }
    private int size() { return N; }

    // interface
    public Iterator<Item> iterator() {
        return new QueueIterator(first);
    }

    private class QueueIterator implements Iterator<Item>{
        private Node<Item> currentItem;
        public QueueIterator(Node<Item> first) { currentItem = first; }
        public boolean hasNext() { return currentItem!=null; }
        public Item next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            Item item = currentItem.item;
            currentItem = currentItem.next;
            return item;
        }
        public void remove() {  }

    }

    public void enqueue(Item a){
        Node oldLast = last;
        last = new Node();
        last.item = a;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldLast.next = last;
        N++;
    }

    public Item dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is Empty!");
        }
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public static void main(String[] args){
        LineQueue<String> queue = new LineQueue<String >();

        while (!StdIn.isEmpty()){
            String line = StdIn.readString();
            if (!line.equals("-")) queue.enqueue(line);
            else StdOut.println("out " + queue.dequeue());
        }

        StdOut.println("Queue Size = " + queue.size());
        for (String s : queue) {
            StdOut.println("each Item = " + s);
        }
    }

}
