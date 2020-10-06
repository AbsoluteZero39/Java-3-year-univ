package com.company;
import java.util.Scanner;

public class Task_5_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of array >>> ");
        int n = input.nextInt();
        String random = "yes";
        System.out.println("So, you wanna array with random nums or input them by yourself? (write yes - for random):");
        String choice = input.next();
        if (choice.equals(random)) {
            System.out.println("Also it's time to choose interval of random nums -_- [A;B]");
            System.out.print("B >>> ");
            int b = input.nextInt();
            System.out.print("A >>> ");
            int a = input.nextInt();
            if(a>b)System.out.println("it doesn't make any sense, but it kinda works");
            b = b-a;
            int[] array = new int[n];
            System.out.println("Your array, sir");
            for (int i = 0; i < n; i++) {
                array[i] = (int) Math.round((Math.random() * (b)) + a);
                System.out.print(array[i]+" ");
            }
            System.out.println();
            int parni = 0, parni_eq_neparni = 0;
            for (int i = 0; i < n; i++) {
                int tmp = array[i];
                if (tmp == 0) parni+=1;
                int c=0,p=0, k;
                while (tmp != 0){
                    k = tmp%10;
                    if (k%2 == 1){
                        c += 1;
                    }
                    else {
                        p +=1;
                    }
                    tmp = (tmp-k)/10;
                }
                if (c==0){
                    parni += 1;
                }
                else if (c == p){
                    parni_eq_neparni += 1;
                }
                c = 0;
                p = 0;

            }
            System.out.println("Only parity nums >>> " + parni);
            System.out.println("Equal number of pair and unpair nums >>> " + parni_eq_neparni);
        }
        else{
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Input num");
                int k = input.nextInt();
                array[i] = k;
            }
            System.out.println("Your array, sir");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int parni = 0, parni_eq_neparni = 0;
            for (int i = 0; i < n; i++) {
                int tmp = Math.abs(array[i]);
                if (tmp == 0) parni+=1;
                int c=0,p=0, k;
                while (tmp != 0){
                    k = tmp%10;
                    if (k%2 == 1){
                        c += 1;
                    }
                    else {
                        p +=1;
                    }
                    tmp = (tmp-k)/10;
                }
                if (c==0){
                    parni += 1;
                }
                else if (c == p){
                    parni_eq_neparni += 1;
                }
                c = 0;
                p = 0;

            }
            System.out.println("Only parity nums >>> " + parni);
            System.out.println("Equal number of pair and unpair nums >>> " + parni_eq_neparni);
        }
    }
}
