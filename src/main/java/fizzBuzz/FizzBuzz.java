package fizzBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public static Map<String, Integer> generateReport(int start, int end) {
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

        Map<String, Integer> report = new HashMap<String, Integer>();
        for (String result : results) {
            if (!result.equals("fizz") & !result.equals("buzz") & !result.equals("fizzbuzz") & !result.equals("lucky")) {
                if (report.containsKey("integer")) {
                    report.put("integer", report.get("integer") + 1);
                } else {
                    report.put("integer", 1);
                }
            } else if (report.containsKey(result)) {
                report.put(result, report.get(result) + 1);
            } else {
                report.put(result, 1);
            }
        }

        return report;
    }
}