package vehicle;

class Car{
    int seats;
    String name;
    double length;
    String type;
    int torque;

    void print(){
        System.out.println(seats+" "+name+" "+length+" "+" "+type+" "+torque);
    }

    void change(int a){
        seats = 10+a;
    }
}

public class PassingClassesToMethods {

    public static void change(Car c){
        c.seats = 4;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.length = 3.99;
        c1.name = "Kia Sonet";
        c1.seats = 5;
        c1.torque = 178;
        c1.type = "SUV";

        change(c1);

        System.out.println(c1.seats);
        c1.print();
        c1.change(10);
        System.out.println(c1.seats);
    }
}

/*
-----------------------Notes-----------------------------
1.Class ke object pass by reference hote hai
 */