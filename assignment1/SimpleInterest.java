package CFCJavaAssignment.assignment1;

public class SimpleInterest {
    public static double simpleInterest(int p, int r, int t) {
        double si = (p * r * t) / 100.00;
        //System.out.println(si);
        return si;
    }

    public static void main(String[] args) {
        int p = 10000;
        int r = 10;
        int t = 1;

        double s = simpleInterest(p, r, t);
        System.out.println(s);

    }
}
