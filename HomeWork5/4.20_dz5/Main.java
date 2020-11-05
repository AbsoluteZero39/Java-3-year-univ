package com.company;
import static java.lang.System.out;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
	Year test = new Year(20,10,2000);
	test.PrintDate();
	test.SetDate(15,1,1993);
	test.PrintDate();
	test.SetDate(28,10,2020);
	test.FindADay(test.date,test.month,test.year);
	Year test2 = new Year(20,10,2020);
	test.Between(test2,test);
    }
}
