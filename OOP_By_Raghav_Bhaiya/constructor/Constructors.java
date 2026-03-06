package constructor;

class Student2{
    String name;
    int rollNo;
    double cgpa;

    // Constructor Overloading
    Student2(){      // default constructor

    }

    Student2(String name,int rollNo, double cgpa){  // parametrized constructor and this keyword
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    void print(){
        System.out.println(name+" "+rollNo+" "+cgpa);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Adarsh",52,9.2);
        s1.print();

        Student2 s2 = new Student2();
        s2.name = "Mayank";
        System.out.println(s2.name);
    }
}

/*
----------------------Notes-----------------------
1.Constructor is a special type of method that has the same name as
class.
2.It automatically runs when the object is created
3.This keyword is used when we keep constructor parameter name sane as
class member
 */