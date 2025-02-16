/*
Senior Citizen Discount

Task: Write a program to check if a person is eligible for a senior citizen discount based on age.

Input: age (an integer representing the person's age) and senior_age (an integer representing the age to qualify as a senior citizen)

Output: "Eligible for senior citizen discount" or "Not eligible for senior citizen discount"

Example:

Input: age = 65, senior_age = 60

Output: "Eligible for senior citizen discount"

Input: age = 55, senior_age = 60

Output: "Not eligible for senior citizen discount"
 */
import java.util.Scanner;
public class seniorCitizenDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the citizen: ");
        int age = sc.nextInt();
        System.out.println("Enter the senior citizen age: ");
        int seniorCitizenAge = sc.nextInt();
        if (age < seniorCitizenAge) {
            System.out.println("You are not senior citizen");
        }
        else {
            System.out.println("You are senior citizen");
        }
    }
}