import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by cube on 03/04/2017.
 */
public class Ex_1_3_15 {

    public static void main(String[] args){
        Queue<String > queue = new Queue<String >();
        StdOut.println("Input K = ");
        String kStr = StdIn.readString();
        Double k = Double.parseDouble(kStr);
        StdOut.println("Input some String ");
        String charAtK = null;
        while (!StdIn.isEmpty()){

            queue.enqueue(StdIn.readString());
        }

        for (int i = 0; i < queue.size(); i++) {
            charAtK = queue.dequeue();
            if (queue.size() - k == i){
                break;
            }
        }


        StdOut.println("String at K is" + charAtK);
    }
}
