// Overriding toString()

// Your application should have a provision to add a user by entering his/her details. The user details include username, contact detail, etc. The address of the user should also be included. Yet address may consist of several attributes. Hence create a console application for entering the address for a user.

// Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

// Create a class named Address with the following private attributes.

// Attributes	  Datatype
  
// addressLine1	String
// addressLine2	String
// city	        String
// state	        String
// pincode	      Integer

// Include appropriate default constructor, getters and setters for the attributes of the Address class.
// Include a parameterized Constructor for the Address class with all attributes. Have a look at the below example
// Address(String addressLine1, String addressLine2, String city,String state, Integer pincode)

// Override the toString() method in the Address class to display the address as per the specifications specified in the Sample Input and Output.

// Create a driver class called Main. In the Main method, obtain input from the console and create a new object for the class Address. Display the address details with the help of the Address object.

// Note: The print statement "The Address Details are" should be in the Main class.

//Main Class

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Address Line 1");
        String address1 = sc.nextLine();

        System.out.println("Enter Address Line 2");
        String address2 = sc.nextLine();

        System.out.println("Enter the City Name");
        String city = sc.nextLine();

        System.out.println("Enter the State Name");
        String state = sc.nextLine();

        System.out.println("Enter the Pincode");
        Integer pincode = sc.nextInt();

        Address address = new Address(address1, address2, city, state, pincode);

        System.out.println("The Address Details are");
        System.out.println(address);
    }
}

//Address class

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;

    public Address() {
    }

    public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return addressLine1 + "\n" + addressLine2 + "\n" + city + "\n" + state + "\n" + pincode;
    }
}

