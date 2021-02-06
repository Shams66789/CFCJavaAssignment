package CFCJavaAssignment.assignment1;

public class Reverse {
    public static int reverseInt(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;

        }
        return rev;
    }


    public static void main(String[] args) {
        int num = 9735;
        //reverse -> 5379
        int res = reverseInt(num);
        System.out.println(res);
    }
}
