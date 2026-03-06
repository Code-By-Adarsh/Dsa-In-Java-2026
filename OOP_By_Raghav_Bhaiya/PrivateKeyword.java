class Students{
    String name = "Rony";
    private int rollNo = 56;
    double cgpa = 9.9;

    private void print(){
        System.out.println(name+" "+rollNo+" "+cgpa);
    }

    void solution(){
        print();
    }
}

public class PrivateKeyword {
    public static class adarsh{
        public static void speak(){
            System.out.println("Adarsh");
        }
    }

    public static void main(String[] args) {
        adarsh.speak(); // we can use without object because of static
        Students s1 = new Students();
        s1.name = "Adarsh";
        System.out.println(s1.name);
        System.out.println(s1.cgpa); // default value such as array
        // s1.rollNo = 56; throws error
        s1.solution();
    }
}

/*
----------------------Notes------------------------
1.Private can only be accessed within the same class

2.🔹 Bahar class kyu banate hain?
Jab class reusable ho.
Example:
Students class
Teacher class
Course class
Inko alag rakhte hain taki project me kahi bhi use kar sake.
Real project me aisa hota hai:
Student.java
Teacher.java
Course.java
Main.java

🔹 Andar class kab banate hain?
Jab class sirf ek hi class ke kaam ke liye ho.
Example:
class School {
    class Student{
        String name;
    }
}
Yaha Student sirf School ke andar use ho raha hai.
Isko bolte hain:
Inner Class

3.Simple rule yaad rakh
Top Level Class
Allowed:
public
default

Not allowed:
private
protected
static

Inner Class
Allowed:
public
private
protected
static
default

4.Static keyword humesha apne outer class ke context me lagta hai

5.kya ye class sirf School ke andar hi visible ho? → private
kya ye subclass ko bhi dikhe? → protected
kya ye outer object ke bina bhi exist kare? → static
 */