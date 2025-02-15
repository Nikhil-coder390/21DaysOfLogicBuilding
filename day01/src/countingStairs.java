/*
Counting Stairs:

Task: Write a program to determine if the top step of a staircase with n steps is even or odd.

Input: n (an integer representing the number of steps)

Output: "Even" or "Odd"

Example:

Input: n = 5

Output: "Odd"
*/
import java.util.Arrays;
import java.util.Scanner;
public class countingStairs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Stairs: ");
        int n = input.nextInt();
        if(n%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}