package CFCJavaAssignment.assignment2;

import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
        int[] array = {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your target below: ");
        int target = s.nextInt();

        findPair(array, target);
    }

    public static void findPair(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.print(" (" + arr[i] + ", " + arr[j] + ") ");
                }
            }
        }
    }
}
