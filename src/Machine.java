
public class Machine {
  private String manufacturer;
  private int year;
  private String model;
  
  public Machine(String manufacturer, int year, String model) {
      this.manufacturer = manufacturer;
      this.year = year;
      this.model = model;
  }
  /*
  public void startMachine(boolean ignition) {
    if(ignition){
      System.out.println("Machine is on.");
    }
    else {
      System.out.println("Machine is off.");
    }
  }
  
  public void startMachine(boolean ignition, boolean lights) {
    if(ignition && lights){
      System.out.println("Machine is on.");
      System.out.println("Head lights have been turned on.");
    }
    else {
      System.out.println("Machine is off.");
      System.out.println("Head lights have been turned off.");
    }
  }
  */
  public String getManufacturer() {
      return manufacturer;
  }
  
  public int getYear() {
      return year;
  }
  
  public String getModel(){
      return model;
  }
  
  
  public Machine() {
      System.out.println(getManufacturer() + "\t" + getModel() + "\t" + getYear());
  }
}
