package CFCJavaAssignment.assignment2;

import java.util.Scanner;

public class TripletsPair {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 9, 7, 5, -1, 6};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target below: ");
        int target = s.nextInt();

        findTriplets(array, target);
    }

    public static void findTriplets(int[] arr,int k ) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    if (arr[i] + arr[j] + arr[l] == k){
                        System.out.print(" (" + arr[i] + "," + arr[j] + "," + arr[l] + ") ");
                    }
                }
            }
        }
    }
}
