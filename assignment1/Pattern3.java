package CFCJavaAssignment.assignment1;

public class Pattern3 {
    public static void EquiTriangle(int li) {
        int row = 1;
        while (row <= li) {
            int space = li - row;
            int spa = 0;
            int dig = 1;
            int num = 0;
            while (spa <= space) {
                System.out.print("  ");
                spa++;
            }
            while (dig <= row) {
                num += 1;
                System.out.print(num + " ");
                dig++;
            }
            while (num > 1) {
                num -= 1;
                System.out.print(num + " ");
            }
            row++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        EquiTriangle(5);
    }
}
