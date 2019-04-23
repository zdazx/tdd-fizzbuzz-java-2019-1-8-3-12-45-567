package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz(3,5,7);

    @Test
    public void fizz_buzz_test1(){
        int num = 1;
        String expectedResult = "1";
        String result = fizzBuzz.fizzBuzz(num);
        assertThat(expectedResult, is(result));
    }

    @Test
    public void fizz_buzz_test2(){
        int num = 3;
        String expectedResult = "Fizz";
        String result = fizzBuzz.fizzBuzz(num);
        assertThat(expectedResult, is(result));
    }

    @Test
    public void fizz_buzz_test3(){
        int num = 5;
        String expectedResult = "Buzz";
        String result = fizzBuzz.fizzBuzz(num);
        assertThat(expectedResult, is(result));
    }



}
