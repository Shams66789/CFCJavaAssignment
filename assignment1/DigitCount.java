package CFCJavaAssignment.assignment1;

public class DigitCount {
    public static int DigitsCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 36567343;
        int dc = DigitsCount(num);
        System.out.println(dc);
    }
}
