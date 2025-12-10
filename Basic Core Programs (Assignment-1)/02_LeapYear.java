// 2. Leap Year
// a. I/P -> Year, ensure it is a 4 digit number.
// b. Logic -> Determine if it is a Leap Year.
// c. O/P -> Print the year is a Leap Year or not.

import java.util.*;

public class LeapYear {

    // This function checks whether the given year is a leap year or not
    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year (4 digits): ");
        int year = sc.nextInt();

        // Convert to string to check digit count
        String yearString = Integer.toString(year);

        // Validate if it is 4 digits
        while (yearString.length() != 4) {
            System.out.print("Year must be of 4-digit, enter the year again: ");
            year = sc.nextInt();
        }

        // Call function after validation
        checkLeapYear(year);
    }
}
