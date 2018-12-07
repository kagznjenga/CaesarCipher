/* Programmer's Name: Samuel Njenga */

/*This program, in combination with the plant program, 
 * is used to demonstrate Polymorphism in java*/

public class Tree extends Plant {
  @Override
  public void grow() {
    System.out.println("Tree growing.");
  }

  public void shedLeaves() {
    System.out.println("Leaves shedding.");
  }
}
