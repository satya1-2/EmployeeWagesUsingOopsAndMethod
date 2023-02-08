package com.employeeWageUsingMethodAndOops;

public class PartTimeWageUsingSwitchMethod {
    public static final int isPartTime = 1;
    public static  final int isFullTime = 2;
    public static  final int employeeRatePerHour = 20;
    public int employeeChecked(int employeeHrs, int employeeWage ){
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

        employeeWage = employeeHrs * employeeRatePerHour;
        return employeeWage;

    }

    public static void main(String[] args) {
        int employeeHrs=0;
        int employeeWage=0;
        PartTimeWageUsingSwitchMethod partTimeSwitch=new PartTimeWageUsingSwitchMethod();
        System.out.println(partTimeSwitch.employeeChecked(0,0));
    }

}