package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pattern(n);
    }

    public static void Pattern(int n) {
        int line = 0;
        while (line < n) {
            int spa = n - line;
            int spaces = 2 * spa - 2;
            for (int i = 0; i < line + 1; i++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < line + 1; k++) {
                System.out.print("*  ");
            }
            System.out.println();
            line ++;
        }

        while (line >= 0) {
            int spac = n - (line - 2);
            int space = 2 * spac - 2;
            for (int l = 0; l < line - 1; l++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < line - 1; k++) {
                System.out.print("*  ");
            }
            System.out.println();
            line --;
        }
    }
}
