import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_say_1_when_number_is_1() {
        String actualResult = fizzBuzz.say(1);
        String expectedResult = "1";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_2_when_number_is_2() {
        String actualResult = fizzBuzz.say(2);
        String expectedResult = "2";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Fizz_when_number_is_3() {
        String actualResult = fizzBuzz.say(3);
        String expectedResult = "Fizz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_4_when_number_is_4() {
        String actualResult = fizzBuzz.say(4);
        String expectedResult = "4";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Buzz_when_number_is_5() {
        String actualResult = fizzBuzz.say(5);
        String expectedResult = "Buzz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Fizz_when_number_is_6() {
        String actualResult = fizzBuzz.say(6);
        String expectedResult = "Fizz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_7_when_number_is_7() {
        String actualResult = fizzBuzz.say(7);
        String expectedResult = "7";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_8_when_number_is_8() {
        String actualResult = fizzBuzz.say(8);
        String expectedResult = "8";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Fizz_when_number_is_9() {
        String actualResult = fizzBuzz.say(9);
        String expectedResult = "Fizz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Buzz_when_number_is_10() {
        String actualResult = fizzBuzz.say(10);
        String expectedResult = "Buzz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_11_when_number_is_11() {
        String actualResult = fizzBuzz.say(11);
        String expectedResult = "11";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_FizzBuzz_when_number_is_15() {
        String actualResult = fizzBuzz.say(15);
        String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_Buzz_when_number_is_20() {
        String actualResult = fizzBuzz.say(20);
        String expectedResult = "Buzz";
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void should_say_FizzBuzz_when_number_is_30() {
        String actualResult = fizzBuzz.say(30);
        String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, actualResult);
    }
}
