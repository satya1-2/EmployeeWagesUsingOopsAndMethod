package com.employeeWageUsingMethodAndOops;
public class TwoLineEqualOrGreater {
    public static void compareCheck(int x1, int x2, int y1, int y2, int p1, int p2, int q1, int q2) { // Segment of line 1 is stored as a1
        int a1 = (y2 - y1) * p1 + (x1 - x2) * q1
                + (x2 * y1 - x1 * y2);
        if (a1 < 0) {
            // Segment of line 2 is stored as a2

            int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 + (x2 * y1 - x1 * y2);
            if (a2 >= 0)
                System.out.println("Intersecting");
            else if (a2 < 0)
                System.out.println("Not intersecting");
        } else if (a1 > 0) {
            int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 + (x2 * y1 - x1 * y2);
            if (a2 <= 0)
                System.out.println("Intersecting");
            else if (a2 > 0)
                System.out.println("Not intersecting");
        }
        // lines are coincinding
        else
            System.out.println(
                    "points are lying on the line");
    }

    public static void main(String args[]) {
        TwoLineEqualOrGreater straightLine = new TwoLineEqualOrGreater();
        int x1 = 2, x2 = 6;
        int y1 = 3, y2 = 4;
        // Equation of line using slope point form
        System.out.println("Equation 1: (" + (y2 - y1)
                + ")x+(" + (x1 - x2) + ")y+("
                + (x2 * y1 - x1 * y2) + ") = 0");
        int p1 = 3, q1 = 4;
        int p2 = 7, q2 = 1;
        // Equation of line using slope point form
        System.out.println("Equation 2: (" + (q2 - q1)
                + ")x+(" + (p1 - p2) + ")y+("
                + (p2 * q1 - p1 * q2) + ") = 0");

        straightLine.compareCheck(2, 6, 3, 4, 3, 7, 4, 1);//both coordinate of first andsecond line as inut
    }
}


