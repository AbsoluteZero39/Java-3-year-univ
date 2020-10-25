package com.company;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	Interval interval1 = new Interval(20,30, true,false);
        Interval arr[]=new Interval[4];
        Interval arr2[]=new Interval[4];
        arr[0]=new Interval(6,8, true,false);
        arr[1]=new Interval(7,9, true,true);
        arr[2]=new Interval(2,4,false, false);
        arr[3]=new Interval(4,10,true,true);

        arr2[0]=new Interval(1,6, true,true);
        arr2[1]=new Interval(2,8, true,false);
        arr2[2]=new Interval(3,10,false, true);
        arr2[3]=new Interval(5,8,true,true);
        Interval.intervalIntersection(arr2);
        Interval.intervalUnion(arr);
        interval1.Furthest((arr));
    }
}
