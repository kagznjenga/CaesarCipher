import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
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
    
  }

}
