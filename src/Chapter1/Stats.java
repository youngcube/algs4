import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Stats {

    public static final String KEY_COL = ")";

    public static void main(String[] args)
    {
        Stack<String> ops  = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();

            if      (s.equals("("))               ;
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt")) ops.push(s);
            else if (s.equals(")"))
            {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+") ||
                        op.equals("-") ||
                        op.equals("*") ||
                        op.equals("/"))
                    v = String.format("( %s %s %s )", vals.pop(), op, v);
                else if (op.equals("sqrt"))
                    v = String.format("( %s %s )", op, v);

                vals.push(v);
            }
            else vals.push(s);
            //else vals.push(((Double)Double.parseDouble(s)).toString());
        }

        StdOut.println(vals.pop());
    }

    public static void test2(String input){

        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);



        }


    }




    public static void test(String[] args){
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

