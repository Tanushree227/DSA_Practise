package Arrays_DSA;

public class sum_array {

    // Function to check whether any pair exists
    // whose sum is equal to the given target value
    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        // If no pair is found after checking
        // all possibilities
        return false;
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

    // Function to perform binary search
    static boolean binarySearch(int[] arr, int left, int right, int target){
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}

    //Better Approach
    // Function to check whether any pair exists
    // // whose sum is equal to the given target value
    // static boolean twoSum(int[] arr, int target){
    //     // Sort the array
    //     Arrays.sort(arr);

    //     // Iterate through each element in the array
    //     for (int i = 0; i < arr.length; i++) {
    //         int complement = target - arr[i];

    //         // Use binary search to find the complement
    //         if (binarySearch(arr, i + 1, arr.length - 1,
    //                          complement))
    //             return true;
    //     }
    //     // If no pair is found
    //     return false;
    // }

    // public static void main(String[] args){
    //     int[] arr = { 0, -1, 2, -3, 1 };
    //     int target = -2;

    //     // Call the twoSum function and print the result
    //     if (twoSum(arr, target)) {
    //         System.out.println("true");
    //     }
    //     else {
    //         System.out.println("false");
    //     }
    // }

    // two pointer technique
    // static boolean twoSum(int[] arr, int target){
    //     // Sort the array
    //     Arrays.sort(arr);

    //     int left = 0, right = arr.length - 1;

    //     // Iterate while left pointer is less than right
    //     while (left < right) {
    //         int sum = arr[left] + arr[right];

    //         // Check if the sum matches the target
    //         if (sum == target)
    //             return true;
    //         else if (sum < target)
    //             left++; // Move left pointer to the right
    //         else
    //             right--; // Move right pointer to the left
    //     }
    //     // If no pair is found
    //     return false;
    // }

    // public static void main(String[] args){
    //     int[] arr = { 0, -1, 2, -3, 1 };
    //     int target = -2;

    //     // Call the twoSum function and print the result
    //     if (twoSum(arr, target)) {
    //         System.out.println("true");
    //     }
    //     else {
    //         System.out.println("false");
    //     }
    // }