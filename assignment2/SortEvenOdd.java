package CFCJavaAssignment.assignment2;

import java.util.Arrays;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3,8,5,13,6,12,18,5};
        int[] arranged = GetArranged(arr);
        System.out.println(Arrays.toString(arranged));
    }

    public static int[] GetArranged(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    swap(array, i, j);
                    break;
                }
            }
        }
        return array;
    }

    public static void swap(int[] a, int i , int j ) {
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
    }
}
