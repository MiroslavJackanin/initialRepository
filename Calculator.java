package sk.itsovy.jackanin.family;

public class Calculator {
    private String brand;
    private boolean power;

    //CONSTRUCTOR
    public Calculator(String brand) {
        this.brand = brand;
        power=false;
    }

    //GETTERS SETTERS
    public String getBrand() {
        return brand;
    }
    public boolean isPower() {
        return power;
    }

    //METHODS
    public int add(int a, int b){
        if (isPower())
            return a+b;
        else return 0;
    }
    public void turnON(){
        power=true;
    }
    public void turnOFF(){
        power=false;
    }
    public int calculateSquareArea(int a){
        if (isPower())
            return a*a;
        else return 0;
    }
    public double convertCMtoINCH(double value){
        if (isPower())
            return value*0.393701;
        else return 0;
    }
    public double convertINCHtoCM(double value){
        if (isPower())
            return value/0.393701;
        else return 0;
    }
    public void toggleState(){
        power=!power;
    }
    public String convertDecimalToBinary(int value){
        if (isPower())
            return Integer.toBinaryString(value);
        else return null;
    }
    public double rectangleDiagonal(int a, int b){
        if (isPower())
            return Math.pow(Math.E, Math.log((a*a)+(b*b))/2); //respektive lepšie  Math.sqrt(a*a+b*b);
        else return 0;
    }
    public double areaOfCircle(double r) {
        if (isPower())
            return Math.PI * (r * r);
        else return 0;
    }
    public double getArithmeticAverage(int a, int b, int c){
        return (double)(a+b+c)/3;
    }
    public double volumeOfBall(double r){
        return 4*Math.PI*r*r;
    }
    public double areaOfRectangle(double a, double b, double c){
        return 2*(a*b)+2*(b*c)+2*(c*a);
    }
}