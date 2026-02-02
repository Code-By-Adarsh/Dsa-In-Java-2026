import java.util.Scanner;

public class Day16 {
    public static void adarsh(){
        aman();
        virat();
        System.out.println("Mishra");
        mayank();
    }

    public static void mayank(){
        System.out.println("Patel");
        aman();
    }

    public static void aman(){
        System.out.println("Verma");
        virat();
    }

    public static void virat(){
        System.out.println("Kohli");
    }

    public static void sum(int a,int b){
        System.out.println("The sum is: "+ (a+b)); // Boss
    }

    public static void max(int a, int b, int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }

    public static int pritam(){
        System.out.println("Friend");
        return 5; // return statement and khatam
    }

    public static String partner(String a, String b){
        return a+" "+b;
    }

    public static int max(int a, int b){
        if (a>=b){
            return a;
        }
        return -1;
    }

    public static int factorial(int a){
        int ans = 1;
        for (int i=a; i>1; i--){
            ans *= i;
        }
        return ans;
    }

    public static void change(int x){
        x = 10;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After swap: a-> "+a+" b-> "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // Built-In Method/Function:
        // Math wale
        System.out.println(Math.sqrt(24)); // Class Math ke methods
        System.out.println(Math.cbrt(64));
        System.out.println("Pi: "+Math.PI); // Class Math ke property
        System.out.println(Math.abs(-95));
        System.out.println(Math.floor(6.8));
        System.out.println(Math.floor(-7.8));
        System.out.println(Math.ceil(9.6));
        System.out.println(Math.min(5,8));
        System.out.println(Math.max(4,9));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.pow(-3.42,9));
        System.out.println(Math.pow(-7.8,-5.6)); // Error
        System.out.println(Math.pow(0,0));


        // 1st - Greatest among three using function
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        System.out.print("Enter n(1 1): ");
        int y1 = sc.nextInt();
        System.out.print("Enter n(1 2): ");
        int z1 = sc.nextInt();
        System.out.println(Math.max(Math.max(x1,y1),z1));
         */

        // 2nd - Basic Methods
        System.out.println(" ");
        adarsh();

        // 3rd - Arguments VS Parameter
        /*
        Parameter : Variables defined in method declaration
                    Act as a placeholder
                    Exists only inside methods

        Argument : Actual value passed to method
                   Supplies when the method is called
         */
        System.out.println(" ");
        sum(5,6);

        // 3rd - Greatest among three method
        System.out.println(" ");
        System.out.print("The maximum number is: ");
        max(41,56,89);
        System.out.println(Math.pow(-7.8,-7.8)); // error

        // 4rth - Return Type
        System.out.println(" ");
        System.out.println(pritam()); // call lagaya and value use kiya
        System.out.println(pritam()+5); // call lagaya and value use kiya
        pritam(); // only call

        // 5th - Return type - Self built in method partner()
        System.out.println(" ");
        System.out.println(partner("CSK","RCB"));

        // 6th - Self built int method max
        System.out.println(" ");
        System.out.println(max(8,9)+1); // 0
        System.out.println(max(9,8)+1); // 10

        // 7th - Permutation and Combination (ncr)
        System.out.println(" ");
        System.out.print("Enter n: ");
        int a = sc.nextInt();
        int n = factorial(a);
        System.out.print("Enter r: ");
        int b = sc.nextInt();
        int r = factorial(b);
        int c = factorial(a-b);
        System.out.println(n/(r*c));

        // 8th - Pass by value and pass by reference
        System.out.println(" ");
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);

        // 9th - Swap two number
        System.out.println(" ");
        int x1 = 3, y1 = 5;
        int temp = x1;
        x1 = y1;
        y1 = temp;
        System.out.println("a: "+x1);
        System.out.println("b: "+y1);

        // 10th - swap method
        System.out.println(" ");
        System.out.print("Enter a: ");
        int a2 = sc.nextInt();
        System.out.print("Enter b: ");
        int b2 = sc.nextInt();
        System.out.println("Before swap: a-> "+a2+" b-> "+b2);
        swap(a2,b2);
    }
}
