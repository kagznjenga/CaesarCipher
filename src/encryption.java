/* Programmer's Name: Samuel Njenga */
/* Welcome to the source code of this Caesar Cipher program */
/* This program is used to carry out a simple encryption and decryption of user input text */
/*
 * In order to do this I will be using the Caesar Cipher method to shift the letters in the user's
 * input by the specified number of times that they type in as their key This page contains the code
 * for encrypting text
 */

import java.util.Scanner;

public class encryption {

  // This is the encrypting method with two parameters of type String and int
  // The method header is the line of code before the opening curly braces of the class
  public static String encrypt(String plainText, int shift) {
    // Consider that there are 26 letters in the alphabet
    // The if/else statements check that the key entered is between 0 and 26 inclusive
    if (shift > 26) {
      shift = shift % 26;
    } else if (shift < 0) {
      shift = (shift % 26) + 26;
    }
    String cipherText = "";
    // Initialize a variable to store the length of the string input
    // .length() is a string method used to return the length of a string
    int length = plainText.length();
    for (int i = 0; i < length; i++) {
      // charAt() is a string method used to check the character of a string at the specified index
      // The index is determined by the argument passed into the methods parameter i.e ();
      char character = plainText.charAt(i);
      /*
       * The if statement below checks if the character at each index is a letter If it is not a
       * letter the program doesn't change it and goes to the next index
       */
      // .isLetter() is a string method that checks if the character at an index is a letter.
      if (Character.isLetter(character)) {
        // The inner if/else statement checks if the letter is uppercase or lowercase.
        // The letters have different decimal value ranges depending on its case.
        if (Character.isLowerCase(character)) {
          // The code below casts the result of the addition into a character
          char shiftedChar = (char) (character + shift);
          /*
           * The if/else statement below checks if the character shift is out of bounds in the lower
           * case alphabet. If it is out of bounds it goes to the beginning of the alphabet until
           * the last count is done
           */
          if (shiftedChar > 'z') {
            cipherText += (char) (character - (26 - shift));
          } else {
            cipherText += shiftedChar;
          }
        }
        // This else if statement does the same function as the one above for upper case letters.
        else if (Character.isUpperCase(character)) {
          char shiftedChar = (char) (character + shift);
          if (shiftedChar > 'Z') {
            cipherText += (char) (character - (26 - shift));
          } else {
            cipherText += shiftedChar;
          }
        }
      } else {
        cipherText += character;
      }
    }
    return cipherText;
  }

  public static void main(String[] args) {
    // The code below creates a new object from the scanner class to allow for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Input your text:");
    String inputText = input.nextLine();
    System.out.println("Input your key:");
    int key = input.nextInt();
    // The user input text and key will be passed as an argument to the method encrypt.
    String cipherText = encrypt(inputText, key);
    // The output for the result it made.
    System.out.println(cipherText);
  }

}
