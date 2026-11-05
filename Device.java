public interface Device {
    default void turnOn(){
        System.out.println("The device is now on.");
    }
}
