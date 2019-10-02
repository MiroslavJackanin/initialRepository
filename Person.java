package sk.itsovy.jackanin.family;
assaj kalfs hfklsa hfklh kh klf 
public class Person {
    private String name;
    private int age;
    private boolean sex; // T=male F=female
    private double height;
    private int weight;
    private char status; // S=single M=married D=divorced W=widow
    private Phone phone; // default null
    private Calculator calculator;

    //CONSTRUCTERS
    public Person(){

    }
    public Person(String name, int age, boolean sex, double height, int weight, char status){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    //METHODS
    public void about(){
        System.out.println("Hello! I am "+name+".");
    }
    public double calculateBMI(){
        double bmi = weight/(height*height);
        return bmi;
    }
    public String getBMIStatus(){
        if (calculateBMI() < 20)
            return "UNDERWEIGHT";
        if (calculateBMI() < 25)
            return "NORMAL";
        if (calculateBMI() < 31)
            return "OVERWEIGHT";
        return "OBESE";
    }
    public int calculateYear(){
        return 2019-age;
    }
    public boolean hasPhone(){
        if (phone==null)
            return false;
        else
            return true;
    }
    public void print(){
        System.out.println("---------------------------------------");
        System.out.println("  Name:           "+name);
        System.out.println("  Age:            "+age);
        System.out.println("  Sex:            "+sex);
        System.out.println("  Height/weight:  "+height+"/"+weight);
        System.out.println("  BMI:            "+calculateBMI()+" ("+getBMIStatus()+")");
        System.out.println("  Status:         "+status);
        if (hasPhone())
            System.out.println("  Phone:          "+phone.getPhoneNumber());
        System.out.println("---------------------------------------");
    }
    public boolean hasCalculator(){
        return calculator!=null;
    }

    //GETTERS SETTERS
    public void setName(String meno){
        name = meno;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }

    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Calculator getCalculator() {
        return calculator;
    }
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
