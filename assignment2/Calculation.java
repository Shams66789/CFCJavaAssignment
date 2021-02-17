package CFCJavaAssignment.assignment2;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        char ch = s.next().charAt(0);

        int ans = calculate(n1, n2, ch);
        System.out.println(ans);

    }

    public static int calculate(int n1, int n2, char ch) {
        int n;

        if (ch == '*') {
            n = n1 * n2;
            return n;
        }

        else if (ch == '/'){
            n = n1 / n2;
            return n;
        }

        else if (ch == '%'){
            n = n1 % n2;
            return n;
        }

        else if (ch == '+'){
            n = n1 + n2;
            return n;
        }

        else if (ch == '-'){
            n = n1 - n2;
            return n;
        }

        else {
            return -1;
        }
    }
}