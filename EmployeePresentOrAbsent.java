package com.employeeWageUsingMethodAndOops;

public class EmployeePresentOrAbsent {
        int fullTime=1;
        int employeeAttendence;
        public void setEmployeeAttendence(int employeeAttendence) {
            this.employeeAttendence = employeeAttendence;
            double employeeCheck= Math.floor(Math.random() * 20) % 2;
            if (employeeCheck==fullTime){
                System.out.println("present");
            }
            else{
                System.out.println("absent");
            }

        }
        public int getEmployeeAttendence() {
            return employeeAttendence;
        }


        public static void main(String[] args) {

            EmployeePresentOrAbsent emp = new EmployeePresentOrAbsent();
            emp.setEmployeeAttendence(2);
           // System.out.println(emp);


        }}


