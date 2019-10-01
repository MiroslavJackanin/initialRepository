package sk.itsovy.jackanin.family;

import sk.itsovy.jackanin.other.miscClass;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person("Oliver", 19, true, 1.88, 97, 'S');
        Person student = new Person("Oliver", 19, true, 1.88, 97, 'S');

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone("Samsung", "S9", "0908 942 564");

        Calculator calculator1 = new Calculator("Samsung");
        Calculator calculator2 = new Calculator("Casio");

        //PEOPLE
        person1.setName("Miroslav");
        person1.setAge(19);
        person1.setWeight(65);
        person1.setHeight(1.76);

        person2.setName("Lucia");
        person2.setAge(25);
        person2.setWeight(56);
        person2.setHeight(1.65);

        //PHONES
        phone1.setBrand("Huawei");
        phone1.setModel("p30");
        phone1.setPhoneNumber("0948 350 815");

        phone2.setBrand("Samsung");
        phone2.setModel("Galaxy");
        phone2.setPhoneNumber("0905 321 654");

        //CODE
        /*
        person1.about();
        person2.about();
        System.out.print("\n");
        System.out.println(person1.getName() + ", your BMI is: " + person1.calculateBMI() + ". You are: " + person1.getBMIStatus());
        System.out.println(person2.getName() + ", your BMI is: " + person2.calculateBMI() + ". You are: " + person2.getBMIStatus());
        System.out.print("\n");
        System.out.println(person1.getName() + ", you have been born in year " + person1.calculateYear() + ", and are " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + ", you have been born in year " + person2.calculateYear() + ", and are " + person2.getAge() + " years old.");
        */

        //SETTING PHONES TO PEOPLE
        System.out.print("\n");
        person1.setPhone(phone1);
        person2.setPhone(phone2);
        person3.setPhone(phone3);
        student.setPhone(phone2);

        //CODE
        /*
        System.out.println(person1.getName() + " has " + phone1.getBrand() + " and this phone number: " + person1.getPhone().getPhoneNumber() + ", while " + person2.getName() + " has " + phone2.getBrand() + " with this phone number: " + person2.getPhone().getPhoneNumber() + ".");
        System.out.print("\n");
        if (student.hasPhone())
            System.out.println("Student's phone is: " + student.getPhone().getBrand() + ".");
        else
            System.out.println("Student has no phone.");
        System.out.println("\nPersonal information of " + person3.getName() + ": ");
        person3.print();
        */
        //SETTING CALCULATORS TO PEOPLE
        person1.setCalculator(calculator1);
        person2.setCalculator(calculator2);

        //CODE
        /*System.out.println(person1.getName() + " has a " + person1.getCalculator().getBrand() + " and "+person2.getName()+" has a "+person2.getCalculator().getBrand()+" calculator.");
        System.out.print("\nCalculation: \n");
        if (person1.hasCalculator()){
            calculator1.turnON();
            System.out.println(calculator1.add(5,5));
            System.out.println(calculator2.calculateSquareArea(5));
        }
        System.out.println("Convert: ");
        if (person1.hasCalculator()){
            calculator2.turnON();
            System.out.println(calculator1.convertCMtoINCH(16.8));
            System.out.println(calculator2.convertDecimalToBinary(7));
        }
        */

        //NEW CLASS
        miscClass misc1 = new miscClass();

        //CODE
        /*
        misc1.sayHello();
        misc1.sayNHello(4);
        misc1.sayHi();
        misc1.sayNHi(9);

        System.out.println("Calculate diagonal of a rectangle: "+calculator1.rectangleDiagonal(4, 5));
        System.out.println("Area of circle: "+calculator2.areaOfCircle(6));

        System.out.println();
        System.out.println("Round number to even: "+misc1.getEven(8.1235857754));
        System.out.println("Arithmetic average: "+calculator1.getArithmeticAverage(3,5,8));
        System.out.println("Total cost of loan is: "+misc1.getLoan(60, 11.3, 10000.587));
        */

        System.out.println();
        misc1.test();
    }
}