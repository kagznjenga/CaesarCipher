/*/* Programmer's Name: Samuel Njenga
 * 
 * This is the main program where all other programs are executed
 * There is also some additional notes included
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  /**This is where the main program is executed.
   * @param args the command line arguments.
   * 
   */
  public static void main(String[] args) {
    System.out.println("Welcome to this caesar cipher program!\n"
        + "A caesar cipher shifts each letter in the plaintext a certain "
        + "number of places down the alphabet\n"
        + "The number of places shifted depends on the key used, "
        + "which is simply a numeric value\n"
        + "To encrypt you will need to input text for encrypting and "
        + "then use the key generated to decrypt the text.\n");

    // The code below creates a new object from the scanner class to allow for user input
    Scanner input = new Scanner(System.in);

    System.out.println("Input your text: ");
    final String inputText = input.nextLine();

    System.out.println("Input the maximum value to generate a random key from: ");
    int inputKeyNum = 0;

    //try-catch block
    try {
      inputKeyNum = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    /* Creates a new object from the Encryption class then passes and 
     * argument to the keyGenerator method
     */
    Encryption generateKey = new Encryption();
    generateKey.keyGenerator(inputKeyNum);

    System.out.println("Key generated: \n" + Encryption.getKey());

    // The user input text and key will be passed as an argument to the Encryption constructor.

    new Encryption(inputText, Encryption.getKey());
    String encryptedText = Encryption.getCipherText();

    // This code prints out the encoded text
    System.out.println("The encrypted text is: \n" + encryptedText);

    Scanner input2 = new Scanner(System.in);
    System.out.println("\nWould you like to decrytp your text? (yes/no): ");
    String decryptResponse = null;

    //try-catch block
    try {
      decryptResponse = input2.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    if (decryptResponse.equals("yes")) {
      System.out.println("Input the key used for encryption: ");
      int inputKeyNum2 = 0;

      //try-catch block
      try {
        inputKeyNum2 = input2.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("\nThe value you entered is in invalid format.\n");
      }

      String originalText = Decryption.decrypt(encryptedText, inputKeyNum2);

      // Prints out the decoded text
      System.out.println("The decrypted text is:\n " + originalText);

    } else {
      System.out.println("Sorry, your response is invalid. "
          + "The original text is still encrypted:\n " + encryptedText);
    }

    System.out.println("\nDiscussing Data Types:\n");
    Notes.printNotes();

    System.out.println("\nWelcome to the vehicle testing program!");
    System.out.println("Please input the make, model and year of manufacture");
    String make = null;

    //try-catch block
    try {
      make = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    String model = null;

    //try-catch block
    try {
      model = input.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    input.nextLine();
    int year = 0;

    //try-catch block
    try {
      year = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    Car toyota = new Car(make, model, year);
    toyota.carDetails();

    System.out.println("Turn car on? (1 = yes & 0 = no):");
    int userInput = 0;

    //try-catch block
    try {
      userInput = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\nThe value you entered is in invalid format.\n");
    }

    if (userInput == 1) {
      Vehicle.startVehicle(true);

      System.out.println("\nTurn headlights on? (1 = yes & 0 = no)");
      int userInput2 = 0;

      //try-catch block
      try {
        userInput2 = input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("\nThe value you entered is in invalid format.\n");
      }

      if (userInput2 == 1) {
        Vehicle.startVehicle(true, true);

      } else {
        Vehicle.startVehicle(true, false);
      }
    } else {
      Vehicle.startVehicle(false);
    }
    System.out.println("\nYou are all set!\n");

    Arrays.arrayDemo();
    ExtraRequirements.extra();

    System.out.println("\nThis part of the program simply demonstrates polymorphism in java.\n"
        + "Viewing the source courde will make more sense of how this feature was implemented.");
    Plant plant1 = new Plant();
    Tree tree = new Tree();

    Plant plant2 = tree;
    System.out.println();
    plant1.grow();
    plant2.grow();
  }

}
