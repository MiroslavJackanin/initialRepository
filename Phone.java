package sk.itsovy.jackanin.family;

public class Phone {
    private String brand;
    private String model;
    private String phoneNumber;

    //CONSTRUCTORS
    public Phone(){
    }
    public Phone(String brand, String model, String phoneNumber){
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    //GETTERS SETTERS
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
