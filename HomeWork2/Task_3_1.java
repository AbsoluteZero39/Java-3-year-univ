package com.company;
import java.util.Scanner;

public class Task_3_1 {

    public static void main(String[] args) {
        float x1, y1, x2, y2, a, b, y, x;
        Scanner abc = new Scanner(System.in);
        System.out.print("Input x1 >>> ");
        x1 = abc.nextFloat();
        System.out.print("Input y1 >>> ");
        y1 = abc.nextFloat();
        System.out.print("Input a >>> ");
        a = abc.nextFloat();
        System.out.print("Input x2 >>> ");
        x2 = abc.nextFloat();
        System.out.print("Input y2 >>> ");
        y2 = abc.nextFloat();
        System.out.print("Input b >>> ");
        b = abc.nextFloat();
        System.out.println("Г "+ x1 + 'x' +" + "+ y1+ 'y' + " = " + a);
        System.out.println('|');
        System.out.println("L "+ x2 + 'x' +" + "+ y2 + 'y' + " = " + b);
        int a1 = (int)a;
        int b1 = (int)b;
        if (a1 == 0 && b1 == 0) System.out.println("x = y = 0");
        float tmp1, tmp2;
        if (a1 == 0 && b1 == 0) System.out.println("x = y = 0");
        else if (x1 == 0){
            y = a/y1;
            System.out.println("Y >>> "+y);
            x = (b - y2 * y)/x2;
            System.out.println("X >>> "+x);
        }
        else if (y1 == 0){
            x = a/x1;
            System.out.println("X >>> "+x);
            y = (b - x2 * x)/y2;
            System.out.println("Y >>> "+y);
        }
        else if (x2 == 0){
            y = b/y2;
            System.out.println("Y >>> "+y);
            x = (a - y1 * y)/x1;
            System.out.println("X >>> "+x);
        }
        else if (y2 == 0){
            x = b/x2;
            System.out.println("X >>> "+x);
            y = (a - x1 * x)/y1;
            System.out.println("Y >>> "+y);
        }
        else if (y1 == y2 && x1 == x2) System.out.println("<I seen this raw strength only once before> - Obivan Kenobi");
        else{
            tmp1 = x2 * ((-y1)/x1) + y2;
            tmp2 = b - x2 * (a/x1);
            System.out.println("Tmp1 >>> "+tmp1+" Tmp2 >>> "+tmp2);
            y = tmp2 / tmp1;
            System.out.println("Y >>> "+y);
            x = a/x1 - (y*y1)/x1;
            System.out.println("X >>> "+x);
        }
    }
}
