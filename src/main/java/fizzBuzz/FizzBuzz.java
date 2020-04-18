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
        ArrayList<String> results = getResults(start,end);

        String results_string = String.join(" ", results);

        Map<String, Integer> report = generateReport(start, end);
        String fizz = Integer.toString(report.get("fizz"));
        String buzz = Integer.toString(report.get("buzz"));
        String fizzbuzz = Integer.toString(report.get("fizzbuzz"));
        String lucky = Integer.toString(report.get("lucky"));
        String integer = Integer.toString(report.get("integer"));

        return results_string + "\n" + "fizz: " + fizz + "\nbuzz: " + buzz + "\nfizzbuzz: " + fizzbuzz + "\nlucky: " + lucky + "\ninteger: " + integer;
    }

    public static ArrayList<String> getResults(int start, int end) {
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

        return results;
    }

    public static Map<String, Integer> generateReport(int start, int end) {

        ArrayList<String> results = getResults(start, end);

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