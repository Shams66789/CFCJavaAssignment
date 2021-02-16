package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        pattern6(num);
    }

    public static void pattern6(int n) {
        int line = 0;
        int star = 2 * n - 1;
        for (int i = 0; i < star; i++) {
            System.out.print("*  ");
        }
        System.out.println();

        while (line < n - 1) {
            int stars = n - (line + 1);
            int space = 2 * line + 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*  ");
            }
            for (int k = 0; k < space; k++) {
                System.out.print("   ");
            }
            for (int l = 0; l < stars; l++) {
                System.out.print("*  ");
            }
            line++;
            System.out.println();
        }

        while (line > 1) {
            int stars = n - (line - 1);
            int space = 2 * (line - 1) - 1;
            for (int c = 0; c < stars; c++) {
                System.out.print("*  ");
            }
            for (int k = 0; k < space; k++) {
                System.out.print("   ");
            }
            for (int l = 0; l < stars; l++) {
                System.out.print("*  ");
            }
            line--;
            System.out.println();
        }


        for (int m = 0; m < star; m++) {
            System.out.print("*  ");
        }
    }
}
