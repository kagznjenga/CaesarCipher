/* Programmer's Name: Samuel Njenga */

/*This program, is the parent class of the car class from which 
 * the child class can inherit properties and methods created in this class*/
public class Vehicle {
  private String manufacturer;


  public Vehicle(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public Vehicle() {
    System.out.println(getManufacturer());
  }


  public static void startVehicle(boolean ignition) {
    if (ignition) {
      System.out.println("Machine is on.");
    }
    else {
      System.out.println("Machine is off.");
    }
  }

  public static void startVehicle(boolean ignition, boolean lights) {
    if (ignition && lights) {
      System.out.println("Machine is on.");
      System.out.println("Head lights have been turned on.");
    }
    else {
      System.out.println("Machine is off.");
      System.out.println("Head lights have been turned off.");
    }
  }

}
