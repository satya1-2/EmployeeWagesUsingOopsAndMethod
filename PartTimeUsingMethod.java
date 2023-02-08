package com.employeeWageUsingMethodAndOops;

public class PartTimeUsingMethod {
    static int employeeCheck(int isPartTime, int isFullTime, int empRatePerHour, int employeeHrs, int employeeWage) {
        double employeeCheck = Math.floor(Math.random() * 10) % 3;
        if (employeeCheck == isPartTime) {
            employeeHrs = 4;
        } else if (employeeCheck == isFullTime) {
            employeeHrs = 8;
        } else {
            employeeHrs = 0;
        }
        employeeWage = employeeHrs * empRatePerHour;
        //  System.out.println(empWage);
        return employeeWage;
    }

    public static void main(String[] args) {
        int isPartTime = 1;
        int isFullTime = 2;
        int employeeRatePerHour = 20;
        int employeeHrs = 0;
        int employeeWage = 0;
        PartTimeUsingMethod uc = new PartTimeUsingMethod();
        // uc. empCheck(1,2,20,0,0);
        System.out.println(uc.employeeCheck(1, 2, 20, 0, 0));
    }
}
