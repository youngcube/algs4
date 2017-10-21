import edu.princeton.cs.algs4.*;

import javax.xml.soap.Node;
import java.util.Iterator;

import java.util.Arrays;
import java.util.Objects;

public class Main {


    private static final char LEFT_F = '[';
    private static final char LEFT_Y = '(';
    private static final char LEFT_H = '{';

    private static final char RIGHT_F = ']';
    private static final char RIGHT_Y = ')';
    private static final char RIGHT_H = '}';

    public static void main(String args[]){

        while (StdIn.isEmpty()){
            String str = StdIn.readString();
            if (isVaild(str)){
                StdOut.println("OK");
            }else{
                StdOut.println("NO");
            }
        }

    }

    public static boolean isVaild(String input)
    {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            if (a == LEFT_F || a == LEFT_H || a == LEFT_Y){
                stack.push(a);
            }else{
                if (a == RIGHT_F && stack.pop() != LEFT_F) return false;
                if (stack.isEmpty()) return false;

                if (a == RIGHT_H && stack.pop() != LEFT_H) return false;
                if (stack.isEmpty()) return false;

                if (a == RIGHT_Y && stack.pop() != LEFT_Y) return false;
                if (stack.isEmpty()) return false;
            }
        }
        return input.isEmpty();
    }

}






