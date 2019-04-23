package com.thoughtworks.tdd;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private List<Integer> specialNum;
    private List<String> specialStr;

    public FizzBuzz(int num1, int num2, int num3) {
        this.specialNum = Arrays.asList(num1,num2,num3);
        this.specialStr = Arrays.asList("Fizz","Buzz","Whizz");

    }

    public String fizzBuzz(int num){
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < specialNum.size(); i++) {
            if (num % specialNum.get(i) == 0){
                stringBuilder.append(specialStr.get(i));
            }
        }
        if(stringBuilder.length() == 0){
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }
}
