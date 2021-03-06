/* Programmer's Name: Samuel Njenga */
/* Welcome to the source code of this Caesar Cipher program */
/* This program is used to carry out a simple encryption and decryption of user input text */
/*
 * In order to do this I will be using the Caesar Cipher method to shift the letters in the user's
 * input by the specified number of times that they type in as their key This page contains the code
 * for encrypting text
 */

// When doing calculations Java observes operator precedence.
/*
 * This means that java specifies the order in which the operators in a calculation are evaluated
 * when the calculation has several operators
 */

import java.util.Random;

public class Encryption {

  private static int key;
  private static String cipherText;

  // This is a constructor
  public Encryption() {

  }

  /*This is the encrypting constructor with two parameters of type String and integer
   * The method header is the line of code before the opening curly braces of the method
   */
  /**Main method that encrypts text.
   * @param text
   * First parameter.
   * 
   * @param shift
   * Second parameter.
   */
  public Encryption(String text, int shift) {

    /* Consider that there are 26 letters in the alphabet
     * The if/else statements check that the key entered is between 0 and 26 inclusive
     */

    if (shift > 26) {
      shift = shift % 26;
    } else if (shift < 0) {
      shift = (shift % 26) + 26;
    }
    String cipherText = "";

    /* Initialize a variable to store the length of the string input
     * .length() is a string method used to return the length of a string
     */

    int length = text.length();
    for (int i = 0; i < length; i++) {

      // charAt() is a string method used to check the character of a string at the specified index
      // The index is determined by the argument passed into the methods parameter i.e ();

      char character = text.charAt(i);
      /*
       * The if statement below checks if the character at each index is a letter If it is not a
       * letter the program doesn't change it and goes to the next index
       */
      // .isLetter() is a string method that checks if the character at an index is a letter.

      if (Character.isLetter(character)) {

        /* The inner if/else statement checks if the letter is uppercase or lowercase.
         * The letters have different decimal value ranges depending on its case.
         */

        if (Character.isLowerCase(character)) {

          /* The code below casts the result of the addition into a character*/

          char shiftedChar = (char) (character + shift);
          /*
           * The if/else statement below checks if the character shift is out of bounds in the lower
           * case alphabet. If it is out of bounds it goes to the beginning of the alphabet until
           * the last count is done
           */
          if (shiftedChar > 'z') {

            // The code below casts the result into a character

            cipherText += (char) (character - (26 - shift));
          } else {
            cipherText += shiftedChar;
          }


          /* This else if statement below does the same function as 
           * the one above for upper case letters.
           */

        } else if (Character.isUpperCase(character)) {
          char shiftedChar = (char) (character + shift);
          if (shiftedChar > 'Z') {

            // The code below casts the result into a character

            cipherText += (char) (character - (26 - shift));
          } else {
            cipherText += shiftedChar;
          }
        }
      } else {
        cipherText += character;
      }
    }
    this.cipherText = cipherText;
  }

  /**The method generates a random number.
   * @param inputKey
   * 
   */
  public void keyGenerator(int inputKey) {
    Random randomKey = new Random();

    //The final keyword sets the final, permanent value of the variable

    final int randomNumber = randomKey.nextInt(inputKey + 1) + 5;
    this.key = randomNumber;
  }

  public static int getKey() {
    return key;
  }

  public static String getCipherText() {
    return cipherText;
  }

}
