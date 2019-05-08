package com.stackroute.Pe4;

import java.util.Scanner;

public class characterReplacement {
    public static void main(String ar[])
    {
        Scanner scanner=new Scanner(System.in);
                String str1,str2,str3;
                System.out.println("enter the string:");
                 str1=scanner.nextLine();
                 str2=str1.replace('d','f');
                str3= str2.replace('l','t');

                 System.out.println(str3);
    }
}
