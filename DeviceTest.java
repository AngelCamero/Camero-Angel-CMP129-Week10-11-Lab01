import java.util.ArrayList;

public class DeviceTest {
    public static void main(String [] args){
        Smartphone smartphone1 = new Smartphone("Apple", "Iphone 18", 7);
        Smartphone smartphone2 = new Smartphone("samsung", "Galaxy S27", 4.9);
        Laptop Laptop1 = new Laptop("HP", "Victus", "I5 11th generation");
        Laptop Laptop2 = new Laptop("Apple", "Macbook Air", "Intel Xeon");
        ArrayList<Device> devices = new ArrayList<>();
        
        devices.add(smartphone1);
        devices.add(smartphone2);
        devices.add(Laptop1);
        devices.add(Laptop2);
        System.out.println("         Electronic devices");
        System.out.println("-----------------------------------------");
        for (Device device : devices) {
            device.turnOn();
            System.out.println();
        }
    }   
}
