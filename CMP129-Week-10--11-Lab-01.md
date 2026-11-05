CMP 129 – Computer Science II
Weeks 10 and 11 – Lab 1: Device Interface and Polymorphism
Learning Objectives

After completing this lab, students should be able to:

Define and implement a Java interface.
Override an interface method.
Use interface-reference variables.
Store different object types in one collection.
Demonstrate runtime polymorphism.
Add attributes and constructors to implementing classes.
Explain how the same method call produces different behavior.
Assignment: Electronic Device System

Create a Java program that models different electronic devices using an interface and polymorphism.

The program must contain:

Device
Smartphone
Laptop
DeviceTest
Part 1: Device Interface

Create:

Device.java

Declare Device as an interface:

public interface Device

Create a default method:

default void turnOn() {
    System.out.println("The device is now on.");
}

The default implementation provides a generic behavior. The implementing classes will override it with device-specific behavior.

Part 2: Smartphone Class

Create:

Smartphone.java

The class must implement Device:

public class Smartphone implements Device

Include these private attributes:

private String brand;
private String model;
private double screenSize;
Constructor

Create:

public Smartphone(String brand, String model, double screenSize)

The constructor must initialize all three attributes.

Methods

Include getters and setters for:

brand
model
screenSize

Override turnOn():

@Override
public void turnOn()

The method must display the smartphone’s information, including its screen size.

Example:

The Apple iPhone smartphone is powering up.
Screen size: 6.1 inches
Part 3: Laptop Class

Create:

Laptop.java

The class must implement Device:

public class Laptop implements Device

Include these private attributes:

private String brand;
private String model;
private String processorType;
Constructor

Create:

public Laptop(String brand, String model, String processorType)

The constructor must initialize all three attributes.

Methods

Include getters and setters for:

brand
model
processorType

Override turnOn():

@Override
public void turnOn()

The method must display the laptop’s information, including its processor type.

Example:

The Dell XPS laptop is starting.
Processor: Intel Core i7
Part 4: DeviceTest Class

Create:

DeviceTest.java

Place the main() method in this class.

Program Requirements

In main():

Create at least two Smartphone objects.
Create at least two Laptop objects.
Assign each object to a variable of type Device.
Add the objects to a list of Device references.
Iterate through the list.
Call turnOn() for every device.
Demonstrate that Java executes the method belonging to the actual object type.

Example:

Device phone1 = new Smartphone("Apple", "iPhone 17", 6.1);
Device phone2 = new Smartphone("Samsung", "Galaxy S26", 6.7);

Device laptop1 =
        new Laptop("Dell", "XPS", "Intel Core i7");

Device laptop2 =
        new Laptop("Apple", "MacBook Air", "Apple M5");

Create the list:

ArrayList<Device> devices = new ArrayList<>();

devices.add(phone1);
devices.add(phone2);
devices.add(laptop1);
devices.add(laptop2);

Use a loop to call turnOn():

for (Device device : devices) {
    device.turnOn();
    System.out.println();
}

Students must not use separate loops for smartphones and laptops.

Example Output
Electronic Devices
------------------

The Apple iPhone 17 smartphone is powering up.
Screen size: 6.1 inches

The Samsung Galaxy S26 smartphone is powering up.
Screen size: 6.7 inches

The Dell XPS laptop is starting.
Processor: Intel Core i7

The Apple MacBook Air laptop is starting.
Processor: Apple M5

The same statement is used for every object:

device.turnOn();

However, the output changes based on whether the object is a Smartphone or a Laptop. This demonstrates polymorphism.

General Requirements
Declare Device as an interface.
Use implements Device in both device classes.
Override turnOn() in both classes.
Include @Override above each implementation.
Keep all class attributes private.
Use constructors to initialize the attributes.
Include appropriate getters and setters.
Use Device reference variables.
Use an ArrayList<Device> to store the objects.
Use one loop to call turnOn() for every device.
Place each public type in a separate Java file.
Place main() only in DeviceTest.
Follow standard Java naming and formatting conventions.
Include comments explaining the interface and polymorphism.
Ensure the program compiles and runs without errors.
Be prepared to explain why device.turnOn() produces different output.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-10--11-Lab-01.md`
- `AI-Use-Report.md`
- `Device.java`
- `Smartphone.java`
- `Laptop.java`
- `DeviceTest.java`

Do not create or use a `src` folder.


Submission

Students must push:

Device.java
Smartphone.java
Laptop.java
DeviceTest.java
Lab-01/AI-Use-Report.md

Suggested commit messages:

Create Device interface
Implement Smartphone and Laptop classes
Demonstrate device polymorphism
