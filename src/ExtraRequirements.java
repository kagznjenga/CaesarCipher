/* Programmer's Name: Samuel Njenga */

/* This program contains code that tests various skills
 * learnt in the programming class */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtraRequirements {

  /* The main method of the program*/
  /**
   * Main method with no parameters.
   */
  public static void extra() {
    System.out.println("\nThe following is a series of short programs that "
        + "implement various features of Java:\n");

    Scanner input = new Scanner(System.in);
    System.out.println("\nTESTING BOOLEAN FROM USER INPUT:\n");
    System.out.println("Is this statement true or false?\n"
        + "The sky is blue:");
    boolean myBoolean = false;

    ////try-catch block
    try {
      myBoolean = input.nextBoolean();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    if (myBoolean != true) {
      System.out.println("You don't mean that! Haha");
    } else {
      System.out.println("You're awesome");
    }

    System.out.println("\nPARSING DATA TYPES:\n");
    System.out.println("Enter an integer value that will be converted to a double type "
        + "when divided by 100:");
    int myInt = 0;

    ////try-catch block
    try {
      myInt = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    /*The code below casts the result of the division of the integer input to a double data type
     *Type casting is a way to convert a variable from one data type to another data type.
     */
    double myDouble = (double) myInt / 100;
    System.out.println("Your double value is:\n" + myDouble);

    System.out.println("\nEnter your base number(Integer)");
    int myBase = 0;

    //try-catch block
    try {
      myBase = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    System.out.println("Enter your exponent number(Integer)");
    int myExponent = 0;

    //try-catch block
    try {
      myExponent = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    System.out.println("Your number " + myBase + " raised to the power of " + myExponent
        + " equals: " + Math.pow(myBase, myExponent));

    System.out.println("\nUSING A SWITCH STATEMENT TO CHECK CONDITIONS:\n");
    System.out.println("Enter your height rounded to the nearest whole number in meters: ");
    int height = 0;

    //try-catch block
    try {
      height = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    switch (height) {
      case 1:
        System.out.println("You are short");
        break;
      case 2:
        System.out.println("You are of average height");
        break;
      case 3:
        System.out.println("Your are tall");
        break;

      default:
        System.out.println("Sorry the value is not within the set ranges");
    }

    System.out.println("\nCOMPARING STRINGS LEXICOGRAPHICAL:\n");
    System.out.println("Input first word:");
    input.nextLine();
    String str1 = null;

    //try-catch block
    try {
      str1 = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    System.out.println("Input second word:");
    String str2 = null;

    //try-catch block
    try {
      str2 = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    // comparing str1 and str2
    int result = str1.compareTo(str2);

    // prints the return value of the comparison
    if (result < 0) {
      System.out.println(str1 + " precedes " + str2);
    } else if (result == 0) {
      System.out.println(str1 + " is equal to " + str2);
    } else {
      System.out.println(str1 + " comes after " + str2);
    }

    /*The == is a relational operator in Java that is used to compare two operands. 
     * It is used to determine whether the two operands are equal or not.
     *Using the == operator, you can compare any primitive type such as 
     *int, char, float and Booleans.
     *When used with objects, the == operator compares the two object references and 
     *determines whether they refer to the same instance.
     *For that reason we will use equals(), which is a method available in the String class 
     *that is used to compare two strings and determine whether they are equal.
     **/
    System.out.println("\nCHECKING IF TWO STRINGS ARE EQUAL:");
    System.out.println("Input first word:");
    String text1 = null;

    //try-catch block
    try {
      text1 = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    System.out.println("Input second word:");
    String text2 = null;

    //try-catch block
    try {
      text2 = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    if (text1.equals(text2)) {
      System.out.println("The two strings are equal.");
    } else {
      System.out.println("The two strings are not equal\n");
    }

    /*The break statement terminates the loop immediately, and 
     * the control of the program moves to the next statement following the loop.
     * The continue statement skips the current iteration of a loop.
     */
    System.out.println("The next part is a do/while loop that implements the break statement"
        + "\nIt executes and prints the counter as long as it is less than 11"
        + "\nThe break statement stops execution when the counter is greater than 5"
        + "\nSince this is a do/while loop you will have an additional execution");
    int counter = 1;
    int counter2 = 1;
    do {
      System.out.println("Counter = " + counter);
      if (counter > 5) {
        break;
      }
      counter++;
    } while (counter < 11);
    System.out.println("\nThis is the end of the loop.\n");

    System.out.println("The next loop is a for loop that implements the continue statement"
        + "\nThe continue statement skips the current iteration of a loop"
        + "\nWhen the continue statement is executed, "
        + "control of the program jumps to the end of the loop. "
        + "\nThen, the test expression that controls the loop is evaluated"
        + "The program exits the loop when the counter value is equal to 10"
        + "\n(Notice that there are some numbers missing)");

    for (int i = 1; i < 10; i++) {
      if (i >= 4 && i <= 6) {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("\nThis is the end of the loop.");

  }

}
