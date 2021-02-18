package CFCJavaAssignment.assignment2;

public class CountPrime {
    public static void main(String[] args) {
        int[] arr = {5, 45, 23, 63, 27, 80, 15, 2, 65, 30, 97};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (primeCount(arr[i])) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static boolean primeCount(int a) {
        if (a == 1) {
            return true;
        }

        else if (a == 2) {
            return true;
        }

        for (int j = 2; j*j <= a; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
