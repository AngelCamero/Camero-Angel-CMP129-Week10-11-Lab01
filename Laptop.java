public class Laptop implements Device{
    private String brand;
    private String model;
    private String processorType;

    public Laptop(String brand, String model, String processorType){
        this.brand = brand;
        this.model = model;
        this.processorType = processorType;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getProcessorType(){
        return processorType;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setProcessorType(String processorType){
        this.processorType = processorType;
    }
    @Override
    public void turnOn() {
        System.out.println("Laptop brand: " + brand);
        System.out.println("Laptop model: " + model);
        System.out.println("Laptop processor: " + processorType);
    }
}
