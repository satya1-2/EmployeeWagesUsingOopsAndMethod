package com.employeeWageUsingMethodAndOops;
public class LengthOfLineUsingMethod {
    public static double straightLineLength(double x1,double x2,double y1,double y2) {
        double lengthLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lengthLine;

    }
    public static void main(String[] args) {
       double x1, y1, x2, y2;
        LengthOfLineUsingMethod length=new LengthOfLineUsingMethod();
       System.out.println( length.straightLineLength(2,4,5,7));
    }}