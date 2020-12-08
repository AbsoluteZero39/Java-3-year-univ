package com.company;

import static java.lang.System.out;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException,Exception {
		ArrayList<Integer> matrix1 = new ArrayList<Integer>();
		ArrayList<Integer> matrix2 = new ArrayList<Integer>();
		BufferedReader in1 = new BufferedReader(new FileReader("D:\\Java apps\\HomeWork10\\Coll2_task7\\src\\com\\company\\matrix1"));
		BufferedReader in2 = new BufferedReader(new FileReader("D:\\Java apps\\HomeWork10\\Coll2_task7\\src\\com\\company\\matrix2"));
		String line;
		String[] values = new String[0];
		int m1 = 0 ,n1 = 0 ,m2 = 0 ,n2 = 0;
		while ((line = in1.readLine()) != null) {
			values = line.split(" ");
			n1 = values.length;
			for (int i = 0;i<n1;++i) {
				int str_int = Integer.parseInt(values[i]);
				matrix1.add(str_int);
			}
			m1+=1;
		}
		out.println(n1);
		out.println(m1);
		System.out.println(matrix1);

		while ((line = in2.readLine()) != null) {
			values = line.split(" ");
			n2 = values.length;
			for (int i = 0;i<n2;++i) {
				int str_int = Integer.parseInt(values[i]);
				matrix2.add(str_int);
			}
			m2+=1;
		}
		out.println(n2);
		out.println(m2);
		System.out.println(matrix2);
		ArrayList<Integer> sum = new ArrayList<Integer>();
		if (m2!=m1 || n1!=n2){
			throw new Exception("Search it in google https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		}
		for(int i = 0;i<m1*n1;++i){
			sum.add(matrix1.get(i)+matrix2.get(i));
		}
		System.out.println(sum);
		/*
		ArrayList<Integer> multiply = new ArrayList<Integer>();
		if (m1!=n2){throw new Exception("Search it in google https://www.youtube.com/watch?v=NUYvbT6vTPs");}
		ArrayList<ArrayList<Integer>> test1 = new ArrayList<>(m1);
		ArrayList<ArrayList<Integer>> test2 = new ArrayList<>();
		for(int i = 0;i<m1;++i){
			for (int j = 0;j<n1;++j){
				for(int k = 0;k<n1*m1;++k){
					test1.get(i).add(matrix1.get(k),j);
				}
			}
		}
		out.println(test1);
		*/
	}
}
