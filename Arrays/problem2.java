package Arrays;

public class problem2 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int n = arr.length;
    
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
    
            System.out.println("Reversed Array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    
}
