package CFCJavaAssignment.assignment1;

public class DigitCount {
    public static int digitsCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 36567343;
        int dc = digitsCount(num);
        System.out.println(dc);
    }
}
