package CFCJavaAssignment.assignment1;

import java.util.Scanner;

public class CampusLead {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the credit earned:");

        int credits = c.nextInt();

        if (credits < 4500) {
            System.out.println("Raising star");
        }

        if (4500 <= credits && credits < 6000) {
            System.out.println("Mega leader");
        }

        if (6000 <= credits && credits < 7500) {
            System.out.println("Gega leader");
        }

        if (7500 < credits) {
            System.out.println("Tera leader");
        }
    }
}