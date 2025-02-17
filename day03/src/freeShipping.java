/*
Task: Write a program to determine if a user is eligible for free shipping based on their membership status and purchase amount.

Input: membership_status (a boolean) and purchase_amount (a decimal number). Users receive free shipping if they are members and spend more than $75.

Output: "Eligible for free shipping" or "Not eligible for free shipping"

Example:

Input: membership_status = true, purchase_amount = 80

Output: "Eligible for free shipping"

Input: membership_status = false, purchase_amount = 80

Output: "Not eligible for free shipping"
 */
import java.util.*;
public class freeShipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Membership Status: ");
        boolean status = sc.nextBoolean();
        System.out.println("Enter Purchase Amount: ");
        double purchaseAmount = sc.nextDouble();
        double minPurchaseAmount = 65;
        if(status && purchaseAmount > minPurchaseAmount) {
            System.out.println("Eligible for free shipping");
        }
        else {
            System.out.println("Not eligible for free shipping");
        }
    }
}