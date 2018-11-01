import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    // The code below creates a new object from the scanner class to allow for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Input your text: ");
    String inputText = input.nextLine();
    
    Encryption encryptingKey = new Encryption();
    encryptingKey.keyGenerator();
    
    // The user input text and key will be passed as an argument to the method encrypt.
    
    
    /*
    // The code below creates a new object from the scanner class to allow for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Input your text: ");
    String inputText = input.nextLine();

    System.out.println("Input your key(numbers only): ");
    // The final keyword
    int key = input.nextInt();
    // The user input text and key will be passed as an argument to the method decrypt.
    String decipherdText = decrypt(inputText, key);
    // The output for the result it made.
    System.out.println("Decrypted text: \n" + decipherdText);
    
    */

  }

}
