import java.util.Arrays;

public class problem7 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        int count = 0;  // Count of non-zero elements

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];  // Here count is incremented
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }

        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
