// Getters and Setters
  
// Your City council has decided to organize a Fair in your city. The city Mayor has announced a coding contest for creating the application for the Fair. 
// The Best application would be used for the fair and the developer gets a cash prize. You are a well versed and aspiring Programmer in your city. 
// Many programmers have enrolled themselves for the contest and you are one of them. Every contestant is provided with a Schema diagram of the Fair. Get yourself acquainted with Schema and brace yourself for the challenge!!!.

// A part of the Application requires a user prompt to create a new Item Type.

// Strictly adhere to the object Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

// Create a class named ItemType with the following private attributes.

// Attribute	Datatype
// name	String
// deposit	Double
// costPerDay	Double
 
// Include appropriate Getters and Setters for the ItemType class.


//Main class
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemType itemType = new ItemType();
      
        System.out.println("Enter the Item Type Name");
        String name = sc.nextLine();
        itemType.setName(name);

        System.out.println("Enter the Deposit Amount");
        double deposit = sc.nextInt();
        itemType.setDeposit(deposit);

        System.out.println("Enter the Cost per day of the Item Type");
        double costPerDay = sc.nextInt();
        itemType.setCostPerDay(costPerDay);

        itemType.display();
    }
}

//ItemType Class

public class ItemType {

    private String name;
    private double deposit;
    private double costPerDay;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public double getDeposit() {
        return this.deposit;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public double getCostPerDay() {
        return this.costPerDay;
    }

    public void display() {
        System.out.println("Item Name:" + getName());
        System.out.printf("Deposit Amount:%.1f\n", getDeposit());
        System.out.printf("Cost Per Day:%.1f\n", getCostPerDay());
    }
}


