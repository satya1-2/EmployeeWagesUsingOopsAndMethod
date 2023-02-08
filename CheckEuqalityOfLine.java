package com.employeeWageUsingMethodAndOops;

public class CheckEuqalityOfLine {
    double a1, a2, b1, b2, c1, c2;

    static void linesAre(double a1, double b1,
                         double c1, double a2,
                         double b2, double c2) {//method
        if ((a1 / a2 == b1 / b2)
                && (a1 / a2 == c1 / c2)
                && (b1 / b2 == c1 / c2))
            System.out.println("The given straight"
                    + " lines are equality");
        else
            System.out.println("The given straight"
                    + " lines are not Equality");
    }

    public static void main(String[] args) {

        CheckEuqalityOfLine is = new CheckEuqalityOfLine();

         is.linesAre(2,3,4,5,4,6);
    }

}