import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {

        // 1st - BODMAS
        // *,/,% > + and -
        // In *,/ and % follows left-to-right

        // 2nd - +=, -=, *=
        // x += == x = x + 1
        // x -= == x = x - 1
        // x *= == x = x * 1

        // 3rd - x++ , ++x , x-- , --x
        int x = 10;
        System.out.println(x++); // 10
        System.out.println(x); // 11
        System.out.println(++x); // 12

        // 4rth
        System.out.println(" ");
        int x1 = 10;
        int y1 = x1++;
        System.out.println(x1+" "+y1);

        // 5th - Relational Operator
        System.out.println(" ");
        System.out.println(6.0==6);

        // 6th - Even/Odd
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your positive number: ");
        int x2 = sc.nextInt();
        if (x2%2 == 0){
            System.out.printf("%d is an even number.",x2);
        }else {
            System.out.printf("%d is a odd number.",x2);
        }

        // 7th - Positive number divisible by 5 or not
        System.out.println(" ");
        System.out.print("\nEnter your number: ");
        int x3 = sc.nextInt();
        if (x3%5 == 0){
            System.out.println("Divisible by 5.");
        }else {
            System.out.println("Not divisible by 5.");
        }

        // 8th - Printing absolute integer of given number
        System.out.println(" ");
        System.out.print("Enter your number: ");
        int x4 = sc.nextInt();
        System.out.print("Absolute Integer: ");
        if (x4>=0){
            System.out.println(x4);
        }else {
            System.out.println(-x4);
        }

        // 9th - Real number is integer or not
        System.out.println(" ");
        System.out.print("Enter your number: ");
        double x5 = sc.nextDouble();
        if ((int)x5 == x5){
            System.out.println("It is an integer.");
        }else {
            System.out.println("It is not integer.");
        }

        // 10th - Profit/Loss
        System.out.println(" ");
        System.out.print("Enter CP: ");
        double x6 = sc.nextDouble();
        System.out.print("Enter SP: ");
        double y6 = sc.nextDouble();
        if (x6 == y6){
            System.out.println("No profit and no loss.");
        } else if (x6 > y6) {
            System.out.println("There is a loss of: "+(x6-y6));
        }else {
            System.out.println("There is a profit of: "+(y6-x6));
        }

        // --------- Logical Operator (&& / ||)----------------------
        // 11th - 4 digit or not
        System.out.println(" ");
        System.out.print("Enter your (+)ve integer number: ");
        int x7 = sc.nextInt();
        if (x7 > 999 && x7 < 10000){
            System.out.println("Given number is 4 digit number.");
        }else {
            System.out.println("Given number is not 4 digit number.");
        }

        // 12th - Magnitude of integer is smaller than 69 or not
        System.out.println(" ");
        System.out.print("Enter your integer: ");
        int x8 = sc.nextInt();
        if(Math.abs(x8)<69){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
