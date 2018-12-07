
public class Notes {
  public static void printNotes() {
    System.out.println("* Java has various inbuilt data types. \r\n" + 
        " * A data type is a set of values and a set of operations defined on them.\r\n" + 
        " * The 8 main data types are:\r\n" + 
        " * 1. byte: The byte data type is an 8-bit signed two's complement integer. \r\n" + 
        " * It has a minimum value of -128 and a maximum value of 127 (inclusive).\r\n" + 
        " * 2. short: The short data type is a 16-bit signed two's complement integer. \r\n" + 
        " * It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).\r\n" + 
        " * 3. int: By default, the int data type is a 32-bit signed two's complement integer, \r\n" + 
        " * which has a minimum value of -231 and a maximum value of 231-1.\r\n" + 
        " * 4. long: The long data type is a 64-bit two's complement integer. \r\n" + 
        " * The signed long has a minimum value of -263 and a maximum value of 263-1.\r\n" + 
        " * 5. float: The float data type is a single-precision 32-bit IEEE 754 floating point. \r\n" + 
        " * Its range of values is beyond the scope of this discussion\r\n" + 
        " * 6. double: The double data type is a double-precision 64-bit IEEE 754 floating point. \r\n" + 
        " * Its range of values is beyond the scope of this discussion. For decimal values, \r\n" + 
        " * this data type is generally the default choice.\r\n" + 
        " * 7. boolean: The boolean data type has only two possible values: true and false.\r\n" + 
        " * 8. char: The char data type is a single 16-bit Unicode character. \r\n" + 
        " * It has a minimum value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive).\r\n" + 
        "");

    System.out.println("\n**Discussing Inheritance**\n");
    System.out.println("A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). \r\n" + 
        "The class from which the subclass is derived is called a superclass (also a base class or a parent class).\r\n" + 
        "The idea of inheritance is simple but powerful: When you want to create a new class and there is already a class that includes some of the code that you want, \r\n" + 
        "you can derive your new class from the existing class.\r\n" + 
        "\nIn doing this, you can reuse the fields and methods of the existing class without having to write (and debug!) them yourself.\r\n" + 
        "A subclass inherits all the members (fields, methods, and nested classes) from its superclass.\r\n" + 
        "Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.\r\n" + 
        "\n");
    System.out.println("Some of the things you can do in a subclass include:\n"+
        "* The inherited fields can be used directly, just like any other fields.\r\n" + 
        "* You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).\r\n" + 
        "* You can declare new fields in the subclass that are not in the superclass.\r\n" + 
        "* The inherited methods can be used directly as they are.\r\n" + 
        "* You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.\r\n" + 
        "* You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.\r\n" + 
        "* You can declare new methods in the subclass that are not in the superclass.\r\n" + 
        "* You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.\n");
    System.out.println("The sample car program below implements most of these functions of inheritance");
  }
}
