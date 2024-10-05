package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToStringConversion {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Apple","Orange","Grapes");

        String resultantString = stringList.stream().collect(Collectors.joining(" , "));

        System.out.println(resultantString);
    }



}
