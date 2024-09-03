package Arrays;

public class problem6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = arr.length + 1;  // Since one number is missing

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        int missingNumber = totalSum - arrSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
