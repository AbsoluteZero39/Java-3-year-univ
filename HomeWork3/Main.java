package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print(">>> n >>> ");
    	int n = scanner.nextInt();
		Matrix matrix = new Matrix(n);
		double [][] randomMatrix = matrix.generetaMatrix();
		double [][] inputMatrix = matrix.readMatrix();
		double [][] modifiedRandM = matrix.modifyMatrix(randomMatrix);
		double [][] modifiedInputM = matrix.modifyMatrix(inputMatrix);
		out.println("Рандомная матрица");
		matrix.coutMatrix(randomMatrix);
		out.println("-----------------------");
		matrix.coutMatrix(modifiedRandM);
		out.println("-----------------------");
		out.println("Матрица с клавиатуры");
		matrix.coutMatrix(inputMatrix);
		out.println("-----------------------");
		matrix.coutMatrix(modifiedInputM);
    }
}
