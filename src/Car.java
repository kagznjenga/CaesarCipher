/* Programmer's Name: Samuel Njenga */

/* A class that is derived from another class is called a subclass 
 * (also a derived class, extended class, or child class). 
 * The class from which the subclass is derived is called a superclass 
 * (also a base class or a parent class).
 * The idea of inheritance is simple but powerful: When you want to create a new class 
 * and there is already a class that includes some of the code that you want, 
 * you can derive your new class from the existing class.
 * In doing this, you can reuse the fields and methods of the existing class without having 
 * to write (and debug!) them yourself.
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses, but the constructor of 
 * the superclass can be invoked from the subclass.
 * 
 * The car class below is a child class of the parent class vehicle*/

public class Car extends Vehicle {
  private int year;
  private String model;
  
  /* The constructor sets values for the parameters
   * from the user's input */
  /**A constructor with three parameters. 
   * 
   * @param manufacturer
   * First parameter
   * 
   * @param model
   * Second parameter
   * 
   * @param year
   * Third parameter
   */
  public Car(String manufacturer, String model, int year) {
    super(manufacturer);
    this.year = year;
    this.model = model;
  }
  
  /* public getters*/
  public String getModel() {
    return model;
  }
  
  public int getYear() {
    return year;
  }
  
  /**
   * This method prints out the car details.
   */
  public void carDetails() {
    System.out.printf("%s%10s%15s\n\n", "Manufacturer", "Model", "Year");
    System.out.println(super.getManufacturer() + "\t\t" + getModel() + "\t\t" + getYear());
    System.out.println();
  }
}
