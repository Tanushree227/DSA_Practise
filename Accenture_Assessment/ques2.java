//Arun is a bus conductor. His ticket machine is printing numbers in reverse order due to a technical glitch. As a programmer on the bus, you are asked to help him by creating a program to display the numbers correctly.
//Eg:
//Input: 320
//Output: Number in reversed order: 23

public class ques2 {
    
    public static void main(String[] args) {
        // Instead of prompting for input, we directly assign a number
        int inputNumber = 320; // Example input
        int reversedNumber = 0; // Variable to store the reversed number
        
        // Reverse the number using arithmetic operations
        while (inputNumber != 0) {
            int digit = inputNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            inputNumber /= 10; // Remove the last digit from inputNumber
        }
        
        // Display the output
        System.out.println("Number in reversed order: " + reversedNumber);
    }
}
