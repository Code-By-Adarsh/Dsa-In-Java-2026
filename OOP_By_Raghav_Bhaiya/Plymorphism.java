class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal {
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Plymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello Hello");
        }
    }

    public static void main(String[] args) {

        Cat c = new Cat();
        Dog d = new Dog();
        Human h = new Human();

        c.speak();
        d.speak();
        h.speak();

        // ---------Method overloading compile time
        Calculator cal = new Calculator();

        System.out.println(cal.add(2,3));       // 5
        System.out.println(cal.add(2,3,4));     // 9
        System.out.println(cal.add(2.5,3.5));   // 6.0

        // ---------Method Overriding runtime
        Animal a1 = new Dog1();
        Animal a2 = new Cat1();
        a1.sound();
        a2.sound();

    }
}

/*
---------------------Notes----------------------
1.Polymorphism = “many forms.”

2. Two Types of Polymorphism in Java
Java mainly supports 2 types.
| Type         | Also Called        | Happens When                              |
| ------------ | ------------------ | ----------------------------------------- |
| Compile Time | Method Overloading | Same method name but different parameters |
| Runtime      | Method Overriding  | Child class changes parent method         |

3. Compile-Time Polymorphism (Method Overloading)
Java decides which method to call at compile time.
That’s why it’s called compile-time polymorphism.

4. Rules for Method Overloading
This is where many beginners mess up.
Overloading works if parameters change:

✅ Number of parameters
add(int a, int b)
add(int a, int b, int c)

✅ Type of parameters
add(int a, int b)
add(double a, double b)

❌ Return type alone cannot change
Wrong:
int add(int a,int b)
double add(int a,int b)   // ERROR

5. Runtime Polymorphism (Method Overriding)
This is the real powerful polymorphism used everywhere.
Definition:
Child class provides its own implementation of a parent method.
Behavior changes based on object.
That is runtime polymorphism.

6. The Most Important Line (Interview Favorite)
This line represents runtime polymorphism:
Animal a = new Dog();
Meaning:
Reference type → Parent
Object type → Child
At runtime Java decides which method to run.
This is called Dynamic Method Dispatch.
 */
