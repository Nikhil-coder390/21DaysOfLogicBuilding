/*
Fair Share:

Task: Write a program to check if you and a friend can have an equal number of cookies from a given total number of cookies.

Input: cookies (an integer representing the total number of cookies)

Output: "Yes" or "No"

Example:

Input: cookies = 10

Output: "Yes"

Input: cookies = 7

Output: "No"
*/
import java.util.Scanner;
public class fairShare{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cookies: ");
        int cookies = input.nextInt();
        if(cookies%2 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}