/*
Task: Write a program to determine if a user earns bonus points based on their membership status and purchase amount. Members earn bonus points if they spend over $100, while non-members only earn points if they spend over $200.

Input: membership_status (a boolean) and purchase_amount (a decimal number)

Output: "Earns bonus points" or "Does not earn bonus points"

Example:

Input: membership_status = true, purchase_amount = 150

Output: "Earns bonus points"

Input: membership_status = false, purchase_amount = 150

Output: "Does not earn bonus points"
 */
import java.util.Scanner;
public class bonusPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Membership Status: ");
        boolean membershipStatus = sc.nextBoolean();
        System.out.println("Enter Purchase Amount: ");
        double purchaseAmount = sc.nextDouble();
        if(membershipStatus && purchaseAmount > 100) {
            System.out.println("Earns bonus points!");
        }
        else{
            System.out.println("Not earns bonus points!");
        }
    }
}