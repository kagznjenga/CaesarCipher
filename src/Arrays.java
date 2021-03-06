/* Programmer's Name: Samuel Njenga */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Arrays {

  /* This is a void type method that contains operations 
   * related to arrays
   */

  /**
   * This is the main method of this class.
   */
  public static void arrayDemo() {
    System.out.println("\nWelcome to the Array Demos program"
        + "The Array below is a one dimensional array that has already "
        + "been created for you to demonstrate some of the"
        + "different functions that can be performed on an array\n");
    int total = 0;

    //Initialization of a one dimensional array

    int[] values = {21, 24, 15, 17, 43, 37, 14, 35};
    int minimumValue = values[0];

    System.out.printf("%s%10s\n", "Value", "Index");

    for (int i = 0; i < values.length; i++) {
      System.out.printf("%s%10s\n", values[i], i);
      if (values[i] < minimumValue) {
        minimumValue = values[i];
      }
    }

    //The for loop used below is an implementation of the enhanced for loop
    for (int scanArray: values) {
      total += scanArray;
    }
    System.out.println("The sum of the values in this array = " + total);
    System.out.println("The least value in this array = " + minimumValue);

    System.out.println("\nEnter a value in the array to find its location:");
    int index = 0;
    int numberSearch = 0;

    Scanner input = new Scanner(System.in);

    //try-catch block
    try {
      numberSearch = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    boolean valueFound = false;

    while (valueFound == false && index < values.length) {
      if (values[index] == numberSearch) {
        valueFound = true;
      } else {
        index += 1;
      }
    }

    if (valueFound) {
      System.out.println("The number " + numberSearch + " was found at index " + index);
    } else {
      System.out.println("The value you entered was not found in the array.");
    }

    System.out.println("\nThe Array below is a two dimensional array that has already"
        + "been created for you to demonstrate some of the"
        + "different functions that can be performed on a 2D array\n");

    System.out.println("The values below are contained in a 2D(multidimensional) array\n");

    // declaring and initializing a 2D array
    int[][] multiDimArray = { {21,17,19},{23,16,20},{10,25,15} };

    // printing 2D array
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(multiDimArray[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\nThe list below is an array list of String type values");

    // Creating an ArrayList of String
    List<String> animals = new ArrayList<>();

    // Adding new elements to the ArrayList
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Cat");
    animals.add("Dog");

    System.out.println("\n" + animals);

    //Searching for the coordinates of an element in a 2D array.
    System.out.println("\nEnter a value in the 2D array to find its cordinates: ");
    int numSearch = 0;

    //try-catch block
    try {
      numSearch = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    for (int i = 0; i < multiDimArray.length; i++) {
      for (int j = 0; j < multiDimArray[0].length; j++) {
        if (multiDimArray[i][j] == numSearch) {
          System.out.println("The number " + numSearch + " was found at " + i + ", " + j);
          break;
        }
      }
    }

    System.out.println("\nYou have reached the end of the array demos");
  }
}
