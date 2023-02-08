package com.employeeWageUsingMethodAndOops;
public class WageForMonthUsingMethod {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int NumOfWorkingDays = 2;
    public int employeeChecking(int employeeHrs, int employeeWage, int totalEmployeeWage) {
        for (int day = 0; day < NumOfWorkingDays; day++) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case isPartTime:
                    employeeHrs = 4;
                    break;
                case isFullTime:
                    employeeHrs = 8;

                    break;
                default:
                    employeeHrs = 0;
            }
        }
        employeeWage = employeeHrs * empRatePerHour;
        totalEmployeeWage += employeeWage;
        return totalEmployeeWage;
    }
    public static void main(String[] args) {
        int employeeHrs = 0;
        int employeeWage = 0;
        int totalEmployeeWage = 0;
        WageForMonthUsingMethod switchCase = new WageForMonthUsingMethod();
        System.out.println(switchCase.employeeChecking(0, 0, 0));
    }
}