package com.stackroute.Pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multiOccuranceOfWords {
    public static void main(String ar[]) {
        String s = "stackjomvammssastackvmlmvlrstack";
        String pattern = "stack";

        Matcher m = Pattern.compile(pattern).matcher(s);
        while (m.find()) {
            System.out.println("Found at" + m.start() + "-" + m.end());



        }
    }
}