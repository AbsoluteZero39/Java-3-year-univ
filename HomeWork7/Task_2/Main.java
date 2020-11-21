package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	String test = new String();
    Scanner abc = new Scanner(System.in);
    out.println("Input String");
    test = abc.nextLine();
    out.println(test);
    out.println("First occurrence "+ test.indexOf(","));
    out.println("Last occurrence "+ test.lastIndexOf(","));
    int res = test.length() - test.replace(",","").length();
    out.println("Amount: "+ res);
    }
}
