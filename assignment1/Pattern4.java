package CFCJavaAssignment.assignment1;

public class Pattern4 {
    public static void Pyramid(int li) {
        int row = 1;
        int num = 0;
        int n = 1;
        while (row <= li) {
            int space = li - row;
            int spa = 0;
            int dig = 1;
            while (spa <= space) {
                System.out.print("  ");
                spa++;
            }
            while (dig <= row) {
                num += 1;
                System.out.print(num + " ");
                dig++;
            }
            while (num > n) {
                num -= 1;
                System.out.print(num + " ");
            }
            row++;
            System.out.println();
            n++;
        }
    }

    public static void main(String[] args) {
        Pyramid(5);

    }
}

