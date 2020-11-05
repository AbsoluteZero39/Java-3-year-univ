package com.company;
import static java.lang.System.out;

public class Year extends Month {
    public int year;
    public Year(int date ,int month, int year) {
        super(date, month);
        this.year = year;
    }
    public void SetDate(int day, int month, int year){
        if (day < 1 || day >31) {
            throw new Error("ooops");
        }
        else this.date = day;
        if (month < 1 || month >12) {
            throw new Error("ooops");
        }
        else this.month = month;
        if (year < 1) {
            throw new Error("ooops");
        }
        else this.year = year;
    }
    public void PrintDate(){
        out.println(date+"."+month+"."+year);
    }
}
