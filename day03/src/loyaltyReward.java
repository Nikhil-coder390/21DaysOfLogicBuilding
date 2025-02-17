/*
Task: Write a program to check if a user qualifies for a loyalty reward based on their membership status and total purchases over the year.

Input: membership_status (a boolean) and total_purchases (a decimal number representing total purchases for the year). Members who have spent over $500 in a year receive a loyalty reward.

Output: "Eligible for loyalty reward" or "Not eligible for loyalty reward"

Example:

Input: membership_status = true, total_purchases = 600

Output: "Eligible for loyalty reward"

Input: membership_status = true, total_purchases = 450

Output: "Not eligible for loyalty reward"
 */
import java.util.Scanner;
public class loyaltyReward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Membership Status: ");
        boolean status = sc.nextBoolean();
        System.out.println("Enter Total Purchases: ");
        double totalPurchases = sc.nextDouble();
        double MIN_TotalPurchases = 500;
        if(status && totalPurchases >= MIN_TotalPurchases){
            System.out.println("Eligible for loyalty reward");
        }
        else{
            System.out.println("Not eligible for loyalty reward");
        }
    }
}