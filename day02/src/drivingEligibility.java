/*
Driving Eligibility

Task: Write a program to check if a person can apply for a driving license based on age.

Input: age (an integer representing the person's age) and min_driving_age (an integer representing the minimum driving age)

Output: "Eligible for a driving license" or "Not eligible for a driving license"

Example:

Input: age = 17, min_driving_age = 16

Output: "Eligible for driving license"

Input: age = 14, min_driving_age = 16

Output: "Not eligible for driving license"
*/
import java.util.*;
public class drivingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        System.out.println("Min driving age is: ");
        int minDrivingAge = sc.nextInt();
        if (age < minDrivingAge) {
            System.out.println("You are not eligible for a driving eligibility.");
        }
        else {
            System.out.println("You are eligible for a driving eligibility.");
        }
    }
}