package CFCJavaAssignment.assignment1;

public class Pattern2 {
    public static void upTriangle(int n) {
        int r = 0;
        while (r < n) {
            int stars = 0;
            int num = 1;
            while (stars <= r) {
                System.out.print(num + "  ");
                stars++;
                num++;
            }
            System.out.println();
            r++;
        }
    }

    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int input = inp;
        upTriangle(5);
    }
}