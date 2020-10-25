package com.company;
import java.util.Arrays;

import static java.lang.System.out;
public class Interval {
    public int intervalStart;
    public int intervalEnd;
    public Interval(int start, int end,boolean includeLeft, boolean includeRight){
        if(end<start){
            throw new Error("interval must be start<x<end");
        }
        this.intervalStart = includeLeft ? start : start + 1;
        this.intervalEnd = includeRight ? end : end - 1;
    }
    static void intervalUnion(Interval[] intervals){
        Arrays.sort(intervals, (i1, i2) -> i2.intervalStart - i1.intervalStart);

        int index = 0;
        for (int i=1; i<intervals.length; i++)
        {
            if (intervals[index].intervalEnd >=  intervals[i].intervalStart)
            {
                intervals[index].intervalEnd = Math.max(intervals[index].intervalEnd, intervals[i].intervalEnd);
                intervals[index].intervalStart = Math.min(intervals[index].intervalStart, intervals[i].intervalStart);
            }
            else {
                index++;
                intervals[index] = intervals[i];
            }
        }
        out.print("Intervals union: ");
        for (int i = 0; i <= index; i++)
        {
            out.print("[" + intervals[i].intervalStart + ","
                    + intervals[i].intervalEnd + "]");
        }
    };
    static void intervalIntersection(Interval[] intervals){
        int l =intervals[0].intervalStart;
        int r = intervals[0].intervalEnd;
        int s = intervals.length;
        for (int i  = 1;i<s;i++){
            if(intervals[i].intervalStart > r || intervals[i].intervalEnd < l){
                out.println("No intersection");
                return;
            }
            else{
                int nextLeft = intervals[i].intervalStart;
                int nextRight = intervals[i].intervalEnd;
                l = Math.max(l,nextLeft);
                r = Math.min(r,nextRight);
            }
        }
        out.print("Interval intersection: ");
        out.println("[" + l + ";" + r + "]");
    }
    static void Furthest(Interval[] intervals){
        int l =intervals[0].intervalStart;
        int r = intervals[0].intervalEnd;
        int s = intervals.length;
        for (int i  = 1;i<s;i++){
            int nextLeft = intervals[i].intervalStart;
            int nextRight = intervals[i].intervalEnd;
            l = Math.min(l,nextLeft);
            r = Math.max(r,nextRight);
        }
        out.println("Furthest ends: ");
        out.println("[" + l + ";" + r + "]");
    }

}
