import java.util.Scanner;

public class Arrays {
  public static void arrayDemo() {
    int total = 0;
    boolean valueFound = false;
    int values[] = {21, 24, 15, 17, 43, 37, 14, 35};
    int minimumValue = values[0];
    
    System.out.printf("%s%10s\n", "Value", "Index");
  
    for(int i = 0; i < values.length; i++) {
      System.out.printf("%s%10s\n", values[i], i);
      if(values[i] < minimumValue) {
        minimumValue = values[i];
      }
    }
    for(int scanArray: values) {
      total += scanArray;
    }
    System.out.println("The sum of the values in this array = " + total);
    System.out.println("The least value in this array = " + minimumValue);

    System.out.println("\nEnter a value in the array to search for:");
    int index = 0;
    Scanner input = new Scanner(System.in);
    int numberSearch = input.nextInt();
    
    while(valueFound == false && index < values.length) {
      if(values[index] == numberSearch) {
        valueFound = true;
      }
      else {
        index += 1;
      }
    }
    
    if(valueFound) {
      System.out.println("The number " + numberSearch + " was found at index " + index);
    }
    else {
      System.out.println("The value you entered was not found in the array.");
    }
    
  }
}
