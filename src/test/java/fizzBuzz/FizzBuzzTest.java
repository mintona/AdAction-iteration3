package fizzBuzz;

import static org.junit.Assert.*;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void whenGivenNumbers1through20_theOutputWithLuckyIsCorrect() {
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";

        assertThat(fizzBuzz.run(1, 20), containsString(expected));
    }

    @Test
    public void whenGivenNumbers_generateResultsReturnsArrayWithResults() {
        ArrayList<String> expected = new ArrayList<String> ();
        expected.add("1");
        expected.add("2");
        expected.add("lucky");
        expected.add("4");

        assertEquals(expected, fizzBuzz.getResults(1,4));
    }

    @Test
    public void whenGivenNumbers1through20_aReportCanBeGenerated() {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("lucky", 2);
        expected.put("integer", 10);
        expected.put("fizz", 4);
        expected.put("fizzbuzz", 1);
        expected.put("buzz", 3);

        assertEquals(expected, fizzBuzz.generateReport(1,20));
    }
}