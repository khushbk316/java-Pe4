package com.stackroute.Pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNameInString {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                found = true;

            }
            System.out.println("is name harry found?" + found);
            if (!found) {
                System.out.println("No match found.");
            }
        }
    }
}