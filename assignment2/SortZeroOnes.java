package CFCJavaAssignment.assignment2;

import java.util.Arrays;

public class SortZeroOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0,0,1,0,0,1,1};
        int[] sorted = GetSorted(arr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] GetSorted(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == 0) {
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
