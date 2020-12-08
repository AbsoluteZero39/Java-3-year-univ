package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        // Максимальная степень полинома, тоесть если степень полинома 2, то в нем 3 елемента к примеру
        //X^2+2x+1
        int degree, coef1, coef2;
        out.print("Enter degree for poly >>> ");
        degree = abc.nextInt();
        Map<Integer,Integer> poly1 = new HashMap<Integer,Integer>(degree+1);
        Map<Integer,Integer> poly2 = new HashMap<Integer,Integer>(degree+1);
        Map<Integer,Integer> poly3 = new HashMap<Integer,Integer>(degree);
        for(int i = degree;0<=i;--i){
            out.println("X degree >>> "+i);
            out.print("Enter coef near X >>> ");
            coef1 = abc.nextInt();
            poly1.put(i,coef1);
        }

        out.println("First Poly: ");
        for (Map.Entry entry : poly1.entrySet()) {
            out.print(entry.getValue() +"X^" + entry.getKey() + " + ");
        }
        out.println();
        for(int i = degree;0<=i;--i){
            out.println("X degree >>> "+i);
            out.print("Enter coef near X >>> ");
            coef2 = abc.nextInt();
            poly2.put(i,coef2);
        }
        out.println("Second Poly: ");
        for (Map.Entry entry : poly2.entrySet()) {
            out.print(entry.getValue() +"X^" + entry.getKey() + " + ");
        }
        out.println();
        Iterator itr1 = poly1.entrySet().iterator();
        Iterator itr2 = poly2.entrySet().iterator();
        out.println("///////////////////////////////start adding polys/////////////////////////////");

        int k1,k2,v1,v2;
        while(itr1.hasNext()){
            Map.Entry pair1 = (Map.Entry)itr1.next();
            k1 = (int) pair1.getKey();
            v1 = (int) pair1.getValue();
            Map.Entry pair2 = (Map.Entry)itr2.next();
            k2 = (int) pair2.getKey();
            v2 = (int) pair2.getValue();
            if (k1==k2) {poly3.put(k1,v1+v2);}
        }
        for (Map.Entry entry : poly3.entrySet()) {
            out.print(entry.getValue() +"X^" + entry.getKey() + " + ");
        }
    }
}
