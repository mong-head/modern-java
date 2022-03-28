package com.yujin.example;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class whyJava8 {
    public static void main(String[] args) {
        /**
         * 원하는 출력
         * 1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
         */
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /**
         * 실제 출력되는 것
         * 1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10 :
         * 마지막의 : 를 없애고 싶다고 밑의 코드로 하는 경우 유지보수도 어렵고 마지막을 위한 변수가 늘어나게 됨
         * 그렇다고 기존의 for( int i=0; i<10;i++)를 쓰기에는 코드도 길어지고, 실수할 여지도 있음
         */
        final StringBuilder stringBuilder = new StringBuilder();
        for(Integer number : numbers){
            stringBuilder.append(number).append(" : ");
        }
        final String separator = " : ";
        final int stringLength = stringBuilder.length();
        if(stringLength > 0){
            stringBuilder.delete(stringLength - separator.length(), stringLength);
        }
        System.out.println(stringBuilder.toString());

        /**
         * Java8 !!
         */
        final String result = numbers.stream()
                .map(String::valueOf)
                .collect(joining(" : "));

        System.out.println(result);
    }
}
