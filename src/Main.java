/*
 * Java has various inbuilt data types. A data type is a set of values and a set of operations defined on them.
 * The 8 main data types are:
 * 1. byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
 * 2. short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
 * 3. int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1.
 * 4. long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.
 * 5. float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion
 * 6. double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion. For decimal values, this data type is generally the default choice.
 * 7. boolean: The boolean data type has only two possible values: true and false.
 * 8. char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 */
 
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*
    System.out.println("Welcome to this caesar cipher program!\n"
        + "A caesar cipher shifts each letter in the plaintext a certain number of places down the alphabet\n"
        + "The number of places shifted depends on the key used, which is simply a numeric value\n"
        + "To encrypt you will need to input text for encrypting and then use the key generated to decrypt the text.\n");
    
    // The code below creates a new object from the scanner class to allow for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Input your text: ");
    String inputText = input.nextLine();
    
    System.out.println("Input the maximum value to generate a random key from: ");
    int inputKeyNum = input.nextInt();
    
    // Creates a new object from the Encryption class then passes and argument to the keyGenerator method
    Encryption generateKey = new Encryption();
    generateKey.keyGenerator(inputKeyNum);
    
    System.out.println("Key generated: \n" + Encryption.getKey());
    
    // The user input text and key will be passed as an argument to the Encryption constructor.
    
    new Encryption(inputText, Encryption.getKey());
    String encryptedText = Encryption.getCipherText();
    
    // This code prints out the encoded text
    System.out.println("The encrypted text is: \n" + encryptedText);
    
    Scanner input2 = new Scanner(System.in);
    System.out.println("Would you like to decrytp your text? (Yes/No): ");
    String decryptResponse = input2.nextLine();
    
    if(decryptResponse.equals("Yes")) {
      System.out.println("Input the key used for encryption: ");
      int inputKeyNum2 = input2.nextInt();
      String originalText = Decryption.decrypt(encryptedText, inputKeyNum2);
      
      // Prints out the decoded text
      System.out.println("The decrypted text is:\n " + originalText);
    }
    else {
      System.out.println("The original text is still encrypted:\n " + encryptedText);
    }
    */
    Arrays.arrayDemo();
    
  }
  
}
