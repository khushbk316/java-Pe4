package com.stackroute.Pe4;

import java.util.*;

public class stringsort {
    public static void main(String ar[]) {
        int i = 0;
        String reverseString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scanner.nextLine();
        System.out.println("enter the word of your choice");
        String word ;
        StringTokenizer t = new StringTokenizer(str);

        ArrayList<String> listString= new ArrayList<String>();
        while(t.hasMoreTokens())
        {
            word = t.nextToken();
            listString.add(word);
        }
        System.out.println("\n\nList before Sorting.....");
        System.out.println(listString);
        Collections.sort(listString);
        System.out.println("\n\nList after Sorting.....(Ascending order)");
        System.out.println(listString);
        Collections.sort(listString, Collections.reverseOrder());
        System.out.println("\n\nList after Sorting.....(Descending order)");
        System.out.println(listString);
    }
}

