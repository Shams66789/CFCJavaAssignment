package CFCJavaAssignment.assignment2;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,9};
        if (checkSorted(arr)) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean checkSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (i == a.length) {
                break;
            }

            if (a[i] > a[i +1]) {
                return false;
            }

        }
        return true;
    }
}
