/**
 * Deon Jackson
 * CIS 296
 * Project 1
 * ComparingLoans.java
 */

import java.util.Scanner;

public class ComparingLoans {
  public static void main(String[] args) {
    // Initialize scanner to recieve input.
    Scanner input = new Scanner(System.in);
    Double loanAmount = input.nextDouble();
    Double numOfYears = input.nextDouble();
    // Format output text headers.
    System.out.println("\nLoan Amount: " + loanAmount + "\n");
    System.out.println("Number of Years: " + numOfYears + "\n");
    System.out.println("Interest Rate    Monthly Payment    Total Payment \n");
    // Perform calculations and ouput result.
    for (Double i = 5.0; i <= 8.0; i += 0.125) {
      Double monthlyPayment = calculatePayment(i, loanAmount, numOfYears);
      Double fullPayment = monthlyPayment*numOfYears*12;
      System.out.format("%12.3f%% %18.2f %16.2f %n", i, monthlyPayment, fullPayment);
    }
  }

  /**
   * Recieves a rate, loan amount and duration, and returns the payment.
   */
  public static Double calculatePayment(Double rate, Double loanAmount, Double numOfYears) {
    Double rateAsDecimal = rate/100;
    Double numPayments = numOfYears*12;
    // Interest formula algorithm.
    return ( ( rateAsDecimal/12) /
            ( 1 - Math.pow(
                    (1 + rateAsDecimal/12),
                    (-numPayments)
                  )
            ) *
            (loanAmount)
    );
  }
}
