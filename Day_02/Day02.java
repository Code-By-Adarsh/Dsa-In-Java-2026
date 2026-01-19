import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        // 1st - Arithmetic operator
        System.out.println(" ");
        double x = 5, y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        // 2nd - Area of Circle
        System.out.println(" ");
        double r = 9;
        double a = Math.PI*r*r;
        System.out.println(a);

        // 3rd HW - Volume of sphere
        System.out.println(" ");
        double r1 = 3.5;
        double v = (4.0/3)*Math.PI*Math.pow(r1,3);
        double v1 = 4.0/3*Math.PI*Math.pow(r1,3);
        System.out.println(v);
        System.out.println(v1);

        // 4rth HW - Total surface area of cuboid
        System.out.println(" ");
        double l, b, h, ans;
        l = 2.5;
        b = 5;
        h = 7.8;
        ans = 2 * (l * b + b * h + h * l);
        System.out.println(ans);

        // 5th - Variable naming rule
        // Rule 1 - Can start with _ , alphabets and $
        // Rule 2 - Numbers accepted but in middle and end
        // Rule 3 - No any special characters allowed expect _ and $
        // Rule 4 - Spaces and commas are not allowed in variable

        // 6th - Scanner
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double r2 = sc.nextDouble();
        double area = Math.PI*Math.pow(r2,2);
        System.out.printf("Area of circle of radius %.1f : "+area,r2);

        // 7th - Printing square
        System.out.println(" ");
        System.out.print("\nEnter your number: ");
        double n = sc.nextDouble();
        System.out.printf("Square of %.1f : "+n*n,n);

        // 8th - Simple interest
        System.out.println(" ");
        System.out.print("\nEnter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r3 = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest: "+(p*r3*t)/100);

        // 9th - Modulus operator
        System.out.println(" ");
        int a1 = 9;
        int b1 = 4;
        System.out.println(a1%b1);

        // 10th - Int/Double concept
        System.out.println(" ");
        double a2 = 5/2;
        double a3 = 5.0/2;
        System.out.println(a2);
        System.out.println(a3);

        // 11th - Char data type
        System.out.println(" ");
        char adarsh = 'R';
        System.out.println(adarsh);
        char adarsh1 = '$';
        System.out.println(adarsh1);

        // 12th - Typecasting : ek data type se dusre data type conversion
        System.out.println(" ");
        char ch = 'A';
        int a4 = ch; // Implicit typecasting
        System.out.println(a4);
        char ch1 = '$';
        System.out.println((int)ch1); // Explicit typecasting
        System.out.println(ch1+0); // Smart way
        char ch2 = 'a';
        System.out.println(ch2+0);

        // 13th - Int se char me
        System.out.println(" ");
        int x1 = 780000000;
        int x2 = 78;
        char ch3 = (char) x1; // 780000000 % 65536 -> 41728 -> likely ?
        char ch4 = (char) x2; // Implicit typecasting not allowed
        System.out.println(ch3);
        System.out.println(ch4);
    }
}
