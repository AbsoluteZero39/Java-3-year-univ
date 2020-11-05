package com.company;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Day {
    public int date;
    public int hours;
    public Day (int date){
        this.date = date;
    }
    public Day (){
        this.date = 15;
    }
    public void FindADay (int day, int month, int year) throws ParseException {
        String a1 = Integer.toString(day);
        String a2 = Integer.toString(month);
        String a3 = Integer.toString(year);
        String date = a1 + "/" + a2+"/"+a3;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse(date);
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(dt1);
        out.println(finalDay);
    }

}
