package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        rect(num);
    }

    public static void rect(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int  dig = Math.abs(n - i) + 1;
            for (int j = 2 * n - 1; j > 0; j--) {
                int po = Math.abs(n - j) + 1;
                int line = Math.max(dig,po);
                System.out.print(line + "   ");
            }
            System.out.println();
        }
    }
}
