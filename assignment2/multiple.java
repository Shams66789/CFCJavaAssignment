package CFCJavaAssignment.assignment2;

public class multiple {
    public static void main(String[] args) {
        int[] arr = {5, 45, 23, 63, 27, 80, 15, 2, 65, 30};
        multipleOf(arr);
    }

    public static void multipleOf(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
