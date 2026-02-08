// Types of Constructors

// Now you know to create an object and use getters and setters. Next, we move on to another method of object creation, using Constructors. We are going to use the default and parameterized constructor here.

// Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

// Create a class named StallCategory with following private attributes,
// Attribute	 Datatype
// name	String
// detail	String
// Include appropriate getters and setters for the attributes of the StallCategory class.

// Include the following methods in the StallCategory class.

// Method	Description
// StallCategory()	Default constructor to initialize the default values
// StallCategory(String name, String detail)	Parameterized constructor to assign values to its attributes in the order.
// void display()	This method used to display the details of the StallCategory
// as per the specification provided in the Sample Input and Output

// Create a driver class called Main. In the main method, obtain input from the user in the console and create objects for the class StallCategory class using both the constructor and find that there is no difference between them.

//Main class

import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the stall category:");
        String name = sc.nextLine();
        System.out.println("Enter the details of the stall category:");
        String detail = sc.nextLine();

        System.out.println("Using Default Constructor");
        StallCategory stall1 = new StallCategory();
        stall1.setName(name);
        stall1.setDetail(detail);
        stall1.display();

        System.out.println("Using Parameterised Constructor");
        StallCategory stall2 = new StallCategory(name, detail);
        stall2.display();
    }
}

// Stall class

public class StallCategory {

    private String name;
    private String detail;
  
    public StallCategory() {
    }

    public StallCategory(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }
  
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return this.detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    void display() {
        System.out.println("Details of the stall category:");
        System.out.println("Name:" + getName());
        System.out.println("Detail:" + getDetail());
    }
}

