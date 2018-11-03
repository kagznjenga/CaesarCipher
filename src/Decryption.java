/* Programmer's Name: Samuel Njenga */
/* Welcome to the source code of this Caesar Cipher program */
/* This program is used to carry out a simple encryption and decryption of user input text */
/*
 * In order to do this I will be using the Caesar Cipher method to shift the letters in the user's
 * input by the specified number of times that they type in as their key This page contains the code
 * for decrypting the text produced from the encrypting program Execute the encrypting code first
 * and then copy the result as your input into this program
 */

/*
 * Java has a few inbuilt data types used to certain certain types of data The following are
 * examples of common data types used: 1. Int: This type is used to store integer values 2. String:
 * This type is used to store a string of letters and special characters 3. Char: This type is used
 * to store a single character only, mostly letters
 */

// When doing calculations Java observes operator precedence.
/*
 * This means that java specifies the order in which the operators in a calculation are evaluated
 * when the calculation has several operators
 */

import java.util.Scanner;

public class Decryption {
  
  // This is the decrypting method with two parameters of type String and int
  // The method header is the line of code before the opening curly braces of the method
  
  public static String decrypt(String text, int shift) {
    
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
        
        // The inner if/else statement checks if the letter is upper case or lower case.
        // The letters have different decimal value ranges depending on its case.
        
        if (Character.isLowerCase(character)) {
          
          // The code below casts the result of the subtraction into a character
          
          char shiftedChar = (char) (character - shift);
          /*
           * The if/else statement below checks if the character shift is out of bounds in the lower
           * case alphabet. If it is out of bounds it goes to the beginning of the alphabet until
           * the last count is done
           */
          if (shiftedChar < 'a') {
            
            // The code below casts the result into a character
            
            cipherText += (char) (character + (26 - shift));
          } else {
            
            // The code below saves the new character that has been shifted since it is within
            // bounds.
            
            cipherText += shiftedChar;
          }
        }
        // This else if statement below does the same function as the one above for upper case letters.
        
        else if (Character.isUpperCase(character)) {
          
          // The code below casts the result into a character
          
          char shiftedChar = (char) (character - shift);
          if (shiftedChar < 'A') {
            
            // The code below casts the result into a character
            
            cipherText += (char) (character + (26 - shift));
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
}
