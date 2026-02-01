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
    }
}
