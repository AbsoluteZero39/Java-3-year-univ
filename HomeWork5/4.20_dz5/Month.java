package com.company;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Month extends Day {
    public int month;
    public Month(int date, int month) {
        super(date);
        this.month = month;
    }
    public Month(int date) {
        super(date);
        this.month = 6;
    }
    public int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    public void Between (Year d1, Year d2) throws ParseException {
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        String b1 = Integer.toString(d1.date);
        String b2 = Integer.toString(d1.month);
        String b3 = Integer.toString(d1.year);
        String date1 = b1+b2+b3;
        String c1 = Integer.toString(d2.date);
        String c2 = Integer.toString(d2.month);
        String c3 = Integer.toString(d2.year);
        String date2 = c1+c2+c3;
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        Date date = sdf.parse(date1);
        cal1.setTime(date);
        date = sdf.parse(date2);
        cal2.setTime(date);

        System.out.println("Days= " + daysBetween(cal1.getTime(), cal2.getTime()));
    }
}

