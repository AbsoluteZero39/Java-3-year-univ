package com.company;
import java.io.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java apps\\Test.txt"));
        String line = null;
        //while ((line = br.readLine()) != null) {
            //System.out.println(line);
        //}
        while ((line = br.readLine()) != null) {
            prinnt_60(line);
        }

    }
    static void prinnt_60 (String line){
        if(line.length()<=60) out.println(line);
    }
}
