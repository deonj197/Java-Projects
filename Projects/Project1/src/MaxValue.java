/**
 * Deon Jackson
 * CIS 296
 * Project 1
 * MaxValue.java
 */

import java.util.Scanner;

public class MaxValue {
  public static void main(String[] args) {
    // Initialize scanner to recieve input.
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int max = 0;
    int count = 0;
    // Continue to compare numbers until zero is input.
    while (num != 0) {
      // Assign new max if appropriate.
      if (num > max) {
        max = num;
        count = 1;
        num = input.nextInt();
      // Track occurances of max.
      } else if (num == max) {
        count += 1;
        num = input.nextInt();
      // Continue on to next number.
      } else {
        num = input.nextInt();
      }
    }
    // Output the result.
    System.out.println("The largest number is " + max);
    System.out.println("The occurance count of the largest number is " + count);
  }
}
