package com.company;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
public class Matrix {
    public int matrixSize;
    public Matrix(int n) {
        this.matrixSize = Math.abs(n);
    }
    private double rand(int n){
        int min = -n;
        int max = n;
        return Math.random() * (max - min + 1) + min;
    }
    private double round(double num , int scale){
        return new BigDecimal(num).setScale(scale, RoundingMode.HALF_EVEN).doubleValue();
    }

    private double[][] copy(double origin_Matrix[][])
    {
        double copy[][] = new double[origin_Matrix.length][origin_Matrix[0].length];
        for ( int i = 0 ; i < origin_Matrix.length; ++i)
        {
            System.arraycopy(origin_Matrix[i], 0, copy[i], 0, origin_Matrix[i].length);
        }
        return copy;
    }
    public double[][] generetaMatrix(){
        int s = this.matrixSize;
        double[][] array = new double[s][];
        for (int i = 0; i < s; i++) {
            array[i] = new double[s];
            for (int j = 0; j < s; j++) {
                array[i][j] = this.round(this.rand(s),2);
            }
        }
        return array;
    }
    public double[][] readMatrix() {
        out.println("Ведите матрицу");
        int s = this.matrixSize;
        double[][] array = new double[s][];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            array[i] = new double[s];
            for (int j = 0; j < s; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }
    public double[][] modifyMatrix(double [][] matrix){
        double avg = 0;
        double[][] array = this.copy(matrix);
        int s = this.matrixSize;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                avg+= matrix[i][j];
            }
        }
        avg = avg/Math.pow(s,2);
        out.println("Средн ариф "+ avg);
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                array[i][j] = this.round(array[i][j]- avg,2);
            }
        }
        return array;
    }
    public void coutMatrix(double [][] arr){
        for (double[] line : arr) {
            out.println(Arrays.toString(line));
        }
    }
}
