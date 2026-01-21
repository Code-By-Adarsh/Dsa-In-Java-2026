import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - (+)ve integer divisible by 5 or 3 or not
        System.out.println(" ");
        System.out.print("Enter your (+)ve integer: ");
        int x = sc.nextInt();
        if (x % 5 == 0 || x % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 2nd - Sides of triangle or not
        System.out.println(" ");
        System.out.print("Enter first side length: ");
        int x1 = sc.nextInt();
        System.out.print("Enter second side length: ");
        int y1 = sc.nextInt();
        System.out.print("Enter third side length: ");
        int z1 = sc.nextInt();
        if ((x1 + y1) > z1 && (x1 + z1) > y1 && (y1 + z1) > x1) {
            System.out.println("Yes, they can be sides of a triangle.");
        } else {
            System.out.println("No, they cannot be sides of a triangle.");
        }

        // 3rd - Else-if concept
        System.out.println(" ");
        System.out.print("Enter your (+)ve number: ");
        int x2 = sc.nextInt();
        if (x2 % 5 == 0 && x2 % 3 == 0) {
            System.out.println("Rony");
        } else if (x2 % 5 == 0) {
            System.out.println("Riya");
        } else if (x2 % 3 == 0) {
            System.out.println("Banu");
        } else {
            System.out.println("Isha");
        }

        // 4rth - Area of rectangle is greater than perimeter or not
        System.out.println(" ");
        System.out.print("Enter length of rectangle: ");
        int x3 = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int y3 = sc.nextInt();
        if ((x3 * y3) > (2 * (x3 + y3))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 5th - Location of point
        System.out.println(" ");
        System.out.print("Enter the value of x: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter the value of y: ");
        double y4 = sc.nextDouble();
        if (x4 == 0 && y4 == 0) {
            System.out.println("At origin");
        } else if (x4==0) {
            System.out.println("On x-axis");
        } else if (y4==0) {
            System.out.println("On y-axis");
        } else if (x4>0 && y4>0) {
            System.out.println("1st quadrant");
        }else if (x4<0 && y4>0) {
            System.out.println("2nd quadrant");
        }else if (x4<0 && y4<0) {
            System.out.println("3rd quadrant");
        }else {
            System.out.println("4th quadrant");
        }

        // 6th - Greatest in 3
        System.out.println(" ");
        System.out.print("Enter 1st number: ");
        int x5 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y5 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int z5 = sc.nextInt();
        if (x5>=y5 && x5>=z5){
            System.out.println("Greatest number: "+x5);
        }else if (y5>=x5 && y5>=z5){
            System.out.println("Greatest number: "+y5);
        }else {
            System.out.println("Greatest number: "+z5);
        }

        // 7th - Greatest in 3 without && operator
        System.out.println(" ");
        System.out.print("Enter 1st number: ");
        int x6 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y6 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int z6 = sc.nextInt();
        if (x6>=y6){
            if (x6>=z6){
                System.out.println("Greatest number: "+x6);
            }else {
                System.out.println("Greatest number: "+z6);
            }
        }else {
            if (y6>=z6){
                System.out.println("Greatest number: "+y6);
            }else {
                System.out.println("Greatest number: "+z6);
            }
        }

        // 8th - Least in 3 without && operator
        System.out.println(" ");
        System.out.print("Enter 1st number: ");
        int x7 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y7 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int z7 = sc.nextInt();
        if (x7<=y7){
            if (x7<=z7){
                System.out.println("Least number: "+x7);
            }else {
                System.out.println("Least number: "+z7);
            }
        }else {
            if (y7<=z7){
                System.out.println("Least number: "+y7);
            }else {
                System.out.println("Least number: "+z7);
            }
        }

        // 9th - Ternery Operator(IF-Else ka shortcut)
        // Ternary Operator -> condition ? sach : jhoot
        System.out.println(" ");
        System.out.print("Enter your (+)ve number: ");
        int x8 = sc.nextInt();
        System.out.println((x8%2==0) ? "Even" : "Odd");

        // 10th
        System.out.println(" ");
        System.out.print("Enter your number: ");
        int x9 = sc.nextInt();
        int prasun;
        prasun = (x9<0) ? 0 : 100;
        System.out.println(prasun);
        System.out.println(prasun+100);

        // 11th - Greatest in 3 by ternery operator
        System.out.println(" ");
        System.out.print("Enter 1st number: ");
        int x10 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y10 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int z10 = sc.nextInt();
        int a = (x10>=y10) ? (x10>=z10 ? x10 : z10) : (y10>=z10 ? y10 : z10);
        System.out.println("Greatest number: "+a);
    }
}
