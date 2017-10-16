/**
 * Deon Jackson
 * CIS 296
 * Project 1
 * LockerPuzzle.java
 */

public class LockerPuzzle {
  public static void main(String[] args) {
    // Initialize array of lockers.
    boolean[] school = new boolean[100];
    for (boolean locker: school) {
      locker =false;
    }
    // Track which student we are on.
    int student = 1;
    int count = 1;
    // For each student, apply necassary changes to locker states.
    while (student <= 100) {
      if (student != 1) {
        for (int i = student; i < 100; i+=i) {
          school[i-1] = !school[i-1];
        }
        student++;
      // Handle the case of the first student, who opesn all lockers.
      } else {
        for (boolean locker: school) {
          locker = !locker;
        }
        student++;
      }
    }
    // Output the state of each locker.
    for (boolean locker: school) {
      if (locker == true) {
        System.out.println("Locker " + count + " is open");
        count++;
      } else {
        System.out.println("Locker " + count + " is closed");
        count++;
      }
    }
  }
}
