import edu.princeton.cs.algs4.*;

import javax.xml.soap.Node;
import java.util.Iterator;

import java.util.Arrays;
import java.util.Objects;

public class Main {

        public static void main(String[] args) {
            double t = 9.0;
            while (Math.abs(t - 9.0/t) > .00001)
            {
                t = (9.0/t + t) / 2.0;
                StdOut.printf("%.5f\n", t);
            }
        }

        public static int[] histogram(int a[], int M)
        {
            int[] h = new int[M];

            for (int i = 0; i < M; i++) {
                if (i==22){

                }
            }

            return h;
        }
}






