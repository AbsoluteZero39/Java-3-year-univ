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
        test = test.trim();
        int res = test.split(" +").length;
        out.println("Amount of words "+res);
        String arr [] = new String[res];
        arr = test.split(" +");
        int a=0,b=0,c=0,d=0;
        char symbol = abc.next().charAt(0);
        for(int i = 0;i<res;++i){
            int tmp = arr[i].length();
            if (arr[i].charAt(0)== symbol) a++;
            if (arr[i].charAt(tmp-1) == symbol) b++;
            if (arr[i].charAt(0) == symbol && arr[i].charAt(tmp-1)== symbol) c++;
            if (arr[i].charAt(0)==arr[i].charAt(tmp-1) ) d++;
        }
        out.println("Starts with symbol "+a);
        out.println("Ends with symbol "+b);
        out.println("Starts and Ends with symbol "+c);
        out.println("Starts and Ends with equal symbol " + d);
    }
}
