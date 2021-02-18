package CFCJavaAssignment.assignment2;

public class reverse {
    public static void main(String[] args) {
        int num =  38105;
        int res = reverseInt(num);
        System.out.println(res);
    }

    private static int reverseInt(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;

        }
        return rev;
    }
}
