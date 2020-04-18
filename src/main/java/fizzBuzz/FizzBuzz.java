package fizzBuzz;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(run(1,20));
    }

    public static String run(int start, int end) {
        int[] numbers = IntStream.rangeClosed(start, end).toArray();

        ArrayList<String> results = new ArrayList<String>();

        for (int number : numbers) {
            if (Integer.toString(number).contains("3")) {
                results.add("lucky");
            }
            else if (number % 15 == 0) {
                results.add("fizzbuzz");
            } else if (number % 3 == 0) {
                results.add("fizz");
            } else if (number % 5 == 0) {
                results.add("buzz");
            } else {
                results.add(Integer.toString(number));
            }
        }

        return String.join(" ", results);
    }
}