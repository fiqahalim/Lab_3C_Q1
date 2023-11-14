/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

import java.util.*;
class Main {
  public static void main(String[] args) {
    // Create new Scanner object to get user input
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the subtotal and the gratuity rate
    System.out.println("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    // Calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    // Display results
    System.out.println("The gratuity is RM" + gratuity +
      " and total is RM" + total);

    // close program
    input.close();
  }
}