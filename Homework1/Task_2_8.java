package com.company;
import java.util.Scanner;

public class Task_2_8 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number A");
        float A = in.nextFloat();
        System.out.println("Input Number Sign");
        char Sign = in.next().charAt(0);
        System.out.println("Input Number B");
        float B = in.nextFloat();
        float res = 0;
        switch (Sign){
            case '+':
                res = A+B;
                break;
            case '-':
                res = A - B;
                break;
            case '/':
                if (B != 0) res = A / B;
                else {
                    System.out.println("Sorry amigo, but no");
                }
                break;
            case '*':
                res = A*B;
                break;
            case '%':
                res = A%B;
                break;
        }
        System.out.println("Result: ");
        System.out.println(res);
    }
}
