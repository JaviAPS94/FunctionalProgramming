package com.javiaps94.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class JavaExamples {

    public static Function<String, String> toSentenceCase = x -> x.substring(0,1).toUpperCase() + x.substring(1);

    public static String applySomeFunctionToString(String inputString, Function<String, String> myFunction) {
        return myFunction.apply(inputString);
    }

    public static void main(String args[]) {
        String result = applySomeFunctionToString("hello", toSentenceCase);
        System.out.println(result);

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");

        List<String> upperCaseColors = new ArrayList<>();

        for (String color : colors) {
            upperCaseColors.add(color.toUpperCase());
        }

        for (String color : upperCaseColors) {
            System.out.println(color);
        }
    }
}
