package Chapter1;

import edu.princeton.cs.algs4.*;

import java.util.ArrayList;

public class Average {
    public static void main(String[] args) {
        int count = 0;       // number input values
        double sum = 0.0;    // sum of input values

        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        // compute the average
        double average = sum / count;

        // print results
        StdOut.println("Average is " + average);



    }


    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i<N; i++){

        }
    }
}
