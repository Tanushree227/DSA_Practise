//Write a function to calculate the sum of even numbers in a given list of integers. The function should take a list of integers as input and return the sum of all even numbers in the list. In java programming language.
//Sample input: 1 2 3 4 5 6
//Sample output 12

import java.util.List;

public class ques1 {
    public static int sumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5, 6); // Sample input
        int result = sumOfEvenNumbers(inputNumbers);
        System.out.println("Sum of even numbers: " + result); // Sample output: 12
    }
}
