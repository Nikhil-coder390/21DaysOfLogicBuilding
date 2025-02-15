/*
Check Multiple Numbers:

Task: Write a program to check if each number in a given list is even or odd.

Input: numbers (a list of integers)

Output: A list of "Even" or "Odd" corresponding to each number

Example:

Input: numbers = [4, 7, 10]

Output: ["Even", "Odd", "Even"]
*/
import java.util.ArrayList;
import java.util.Scanner;
public class checkMultipleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        ArrayList<String> evenOrodd = new ArrayList<String>();
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        for(int i=0; i<size; i++){
            numbers.add(input.nextInt());
        }
        for(int num: numbers){
            if(num%2==0){
                evenOrodd.add("Even");
            }
            else evenOrodd.add("Odd");
        }
        System.out.println("Input List: " + numbers);
        System.out.println("Output list: " + evenOrodd);
    }
}