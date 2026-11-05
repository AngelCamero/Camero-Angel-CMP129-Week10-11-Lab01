public class Smartphone implements Device{
    private String brand;
    private String model;
    private double screenSize;

    public Smartphone(String brand, String model, double screenSize){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }
    @Override
    public void turnOn() {
        System.out.println("Smartphone brand: " + brand);
        System.out.println("Smartphone model: " + model);
        System.out.println("Smartphone screen size: " + screenSize);
    }
}
