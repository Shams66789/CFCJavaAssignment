package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class pattern5 {
    public static void Pyramid(int num){
        int row = 1;
        while (row <= num) {
            int space = num - row;
            int spa = 0;
            //int num = 0;
            int dig = 1;
            while (spa < space) {
                System.out.print("   ");
                spa++;
            }
            while (dig <= row) {
                //num += 1;
                System.out.print("*  ");
                dig++;
            }
            while (dig > 2) {
                dig -= 1;
                System.out.print("*  ");
            }
            row++;
            System.out.println();
        }

        int nu = 1;
        while (nu < num){
            //System.out.println("  ");
            int s = 0;
            int sp = num - nu;
            int st = 1;
            while (s < nu) {
                System.out.print("   ");
                s++;
            }
            while (st < sp){
                System.out.print("*  ");
                st += 1;
            }
            for (int stre = 0; stre < sp ; stre++) {
                System.out.print("*  ");
            }
            System.out.println();
            nu++;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pyramid(n);
    }
}
