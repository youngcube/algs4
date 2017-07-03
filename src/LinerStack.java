import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
public class LinerStack<Item>  {

    public Node first;
    public int N;

    public class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item a){
        Node oldNode = first;
        first = new Node();
        first.item = a;
        first.next = oldNode;
        N++;
    }

    public Item pop(){
        Item popitem = first.item;
        first = first.next;
        N--;
        return popitem;
    }

    // TestCase
    public static void main(String[] args) {
        LinerStack<String> stack = new LinerStack<String>();
        while (!StdIn.isEmpty()){
            String as = StdIn.readString();
            if (!as.equals("-")) stack.push(as);
            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " " + "\n");
        }
        StdOut.println(stack.size() + " left in the Stack");
    }
}
