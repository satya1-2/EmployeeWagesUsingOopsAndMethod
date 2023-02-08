package com.employeeWageUsingMethodAndOops;

public class CalculateDailyEmplooyeInMethod {
    public int dailyWage(int isFullTime,int employeeRatePerHour,int employeeHrs,int employeeWage) {
        double employeeCheck = Math.floor(Math.random() * 20) % 2;
        if (employeeCheck == isFullTime) {
            employeeHrs = 8;
        } else {
            employeeHrs = 0;
        }
        employeeWage = employeeHrs * employeeRatePerHour;
        return employeeWage;
    }
    public static void main(String[] args) {
        int IsFullTime = 1;
        int EmpRatePerHrs = 20;
        int employeeHrs = 0;
        int employeeWages = 0;
        CalculateDailyEmplooyeInMethod uc2=new  CalculateDailyEmplooyeInMethod();
            System.out.println(uc2.dailyWage(1,20,0,0));

    }
}
