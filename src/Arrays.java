import java.util.Scanner;

public class Arrays {
  public static void arrayDemo() {
    int index = 0;
    int total = 0;
    int arrayInput[] = new int[10];
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your element in the array:");
    
    System.out.printf("%s%10s\n", "Value", "Index");
  
    for(int i = 0; i < arrayInput.length; i++) {
      System.out.printf("%d%10d\n", arrayInput[index] = input.nextInt(), index);
      index++;
      
    }
    
    for(int scanArray: arrayInput) {
      total += scanArray;
    }
    System.out.println("The sum of your values in this array = " + total);
  }
}
