package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class Pattern1 {
    public static void upTriangle(int n) {
        int r = 0;
        while (r < n) {
            int stars = 0;
            while (stars <= r) {
                System.out.print("*  ");
                stars++;
            }
            System.out.println( );
            r++;
        }
    }

    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int input = inp;
        upTriangle(5);
    }
}
