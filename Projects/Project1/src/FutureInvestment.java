/**
 * Deon Jackson
 * CIS 296
 * Project 1
 * FutureInvestment.java
 */

import java.util.Scanner;

public class FutureInvestment {
  public static void main(String[] args) {
    // Initialize scanner to recieve input.
    Scanner input = new Scanner(System.in);
    // Read in investment amount and rate of interest.
    double investment = input.nextDouble();
    double rate = input.nextDouble();
    // Format headers.
    System.out.format("The amount invested: %.1f\n\n", investment);
    System.out.format("Annual interest rate: %.1f%%\n\n", rate);
    System.out.format("Years %5s Future Value\n\n", "");
    // Calculate each future value and format the result.
    for (int year = 1; year <= 30; year++) {
      System.out.format("%2d %16.2f\n", year, futureInvestmentValue(investment, rate/100/12, year));
    }
  }
 /**
  * Recieves an ammount, rate, and duration. Returns the future value.
  */
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
    return  investmentAmount*Math.pow((1 + monthlyInterestRate),years*12);
  }
}
