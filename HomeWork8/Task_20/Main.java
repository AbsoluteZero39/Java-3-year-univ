package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {
	// USA date format MM/DD/YYYY
    // Ukr date format DD.MM.YYYY
        String test = new String();
        Scanner abc = new Scanner(System.in);
        out.println("Input String");
        test = abc.nextLine();
        out.println(test);
        test = test.trim();
        int res = test.split(" +").length;
        String arr [] = new String[res];
        arr = test.split(" +");
        for (int i=0;i<res;++i){
            out.println(arr[i]);
        }
        for (int i=0;i<res;++i){
            if (arr[i].length() == "MM/DD/YYYY".length() && arr[i].charAt(2) == '/'){
                arr[i] = arr[i].replace("/",".");
                char t1 = arr[i].charAt(0), t2 = arr[i].charAt(1), t3 = arr[i].charAt(3), t4 = arr[i].charAt(4);
                char [] tmp = arr[i].toCharArray();
                tmp[0] = t3;
                tmp[1] = t4;
                tmp[3] = t1;
                tmp[4] = t2;
                arr[i] = new String(tmp);
            }
        }
        for (int i=0;i<res;++i){
            out.print(arr[i]+" ");
        }
    }
}
