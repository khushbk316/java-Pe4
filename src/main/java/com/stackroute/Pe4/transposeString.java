package com.stackroute.Pe4;

import java.util.Scanner;

public class transposeString {
    public static void main(String ar[])
    {

        String str,reverseString;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string:");
        str=scanner.nextLine();
        String arr[]=str.split(" ");
        reverseString="";
        for(String w:arr)
        {
        StringBuilder stringBuilder=new StringBuilder(w);
        stringBuilder.reverse();
        reverseString=reverseString+stringBuilder.toString()+" ";


        }
        System.out.println(reverseString);
    }
}
