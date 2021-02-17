package CFCJavaAssignment.assignment2;

import java.util.Scanner;

public class PredictUpperLower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        Predict(c);
    }

    public static void Predict(char c) {
        if (c >= 65 && c <= 90) {
            System.out.println(c + " is a Uppercase letter");
        }
        else if (c >= 97 && c <= 122) {
            System.out.println(c + " is a Lowercase letter");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
