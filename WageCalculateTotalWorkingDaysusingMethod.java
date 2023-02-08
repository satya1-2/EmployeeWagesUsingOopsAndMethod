package com.employeeWageUsingMethodAndOops;
public class WageCalculateTotalWorkingDaysusingMethod {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int NumOfWorkingDays = 2;
    public static final int maxHourInMonth = 10;
    public int totalWorkingDays(int employeeHrs, int totalEmployeeHrs, int totalWorkingDays) {
        while (totalEmployeeHrs <= maxHourInMonth && totalWorkingDays < NumOfWorkingDays) {
            totalWorkingDays++;
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
            totalEmployeeHrs += employeeHrs;
            int totalEmpWage = totalEmployeeHrs * empRatePerHour;
        }
        return totalEmployeeHrs;
    }
    public static void main(String[] args) {
        int employeeHrs = 0;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        WageCalculateTotalWorkingDaysusingMethod workingDays = new WageCalculateTotalWorkingDaysusingMethod();
        System.out.println(workingDays.totalWorkingDays(0, 0, 0));
    }
}
