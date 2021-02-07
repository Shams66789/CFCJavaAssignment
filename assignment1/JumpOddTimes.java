package CFCJavaAssignment.assignment1;

public class JumpOddTimes {
    public static void main(String[] args) {
        int n = 2;
        int count = 1;
        while (n <= 1000) {
            System.out.print(n + " ");

            n = 4 * count + n;
            count += 1;
        }
    }
}
