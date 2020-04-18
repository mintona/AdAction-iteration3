package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void whenGivenNumbers1through20_theOutputWithLuckyIsCorrect() {
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";

        assertThat(fizzBuzz.run(1, 20), containsString(expected));
    }
}