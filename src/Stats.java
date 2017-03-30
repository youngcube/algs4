import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Stats {
    public static void main(String[] args) {

        Stack<String> opt = new Stack<String>();
        Stack<Double> num = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+")) {
                opt.push(s);
            } else if (s.equals("-")) {
                opt.push(s);
            } else if (s.equals("*")) {
                opt.push(s);
            } else if (s.equals("/")) {
                opt.push(s);
            } else if (s.equals("(")) {

            } else if (s.equals(")")) {

                Double pback = num.pop();
                String popOpt = opt.pop();

                if (popOpt.equals("+")) {
                    pback = num.pop() + pback;
                } else if (popOpt.equals("-")) {
                    pback = num.pop() - pback;
                } else if (popOpt.equals("*")) {
                    pback = num.pop() * pback;
                } else if (popOpt.equals("/")) {
                    pback = num.pop() / pback;
                }
                num.push(pback);

            } else {
                num.push(Double.parseDouble(s));
            }
        }
        StdOut.println(num.pop());
    }
}

