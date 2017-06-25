import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ListStack<Item> {
    private class Node {
        Item item;
        Node next;
    }
    private Node first;
    public int N;
    private boolean isEmpty() { return N == 0; }
    private void push(Item item) {
        Node oldNode = first;
        first = new Node();
        first.item = item;
        first.next = oldNode;
        N++;
    }

    private Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    // 测试用例
    public static void main(String[] args){
        ListStack<String> list = new ListStack<String>();
        while (!StdIn.isEmpty()){
            String a = StdIn.readString();
            if (a.equals("-")) {
                StdOut.println(list.pop());

            }
            else list.push(a);
        }
        StdOut.println("a + s =" + list.N);
    }
}
