import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Count digits of number
        System.out.println(" ");
        System.out.print("Enter number: ");
        int x1 = sc.nextInt();
        int y1 = 0; // count
        if (x1==0){
            System.out.println("Total digits: "+1);
        }else {
            while (x1!=0){
                x1 /= 10;
                y1++;
            }
            System.out.println("Total digits: "+y1);
        }

        // 2nd - Print sum of digit of number
        System.out.println(" ");
        System.out.print("Enter number: ");
        int x2 = sc.nextInt();
        int y2 = 0; // sum
        if (x2==0){
            System.out.println("Total sum: "+0);
        }else {
            x2 = Math.abs(x2);
            while (x2!=0){
                y2 += x2%10;
                x2 /= 10;
            }
            System.out.println("Total sum: "+y2);
        }

        // 3rd - Reverse of a number
        System.out.println(" ");
        System.out.print("Enter number: ");
        int x3 = sc.nextInt();
        int y3 = 0; // reverse number
        while (x3!=0){
            y3 += x3%10;
            y3 *= 10;
            x3 /= 10;
        }
        System.out.println("Reverse number: "+y3/10);

        // 4rth - HW - Sum of number and its reverse
        System.out.println(" ");
        System.out.print("Enter number: ");
        int x4 = sc.nextInt();
        int z4 = x4;
        int y4 = 0; // reverse number
        while (x4!=0){
            y4 += x4%10;
            y4 *= 10;
            x4 /= 10;
        }
        System.out.println("Sum: "+(y4/10+z4));

        // 5th - Factorial
        System.out.println(" ");
        System.out.print("Enter (+)ve number: ");
        int x5 = sc.nextInt();
        long fact = 1;
        if (x5<0){
            System.out.println("Factorial of negative are not defined.");
        } else if (x5==0) {
            System.out.println("Factorial: 1");
        }else {
            while (x5>0){
                fact *= x5;
                x5--;
            }
            System.out.println("Factorial: "+fact);
        }

        // 6th - a raise to the power b
        System.out.println(" ");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int ans = 1;
        for (int i=1; i<=b; i++){
            ans *= a;
        }
        System.out.println("Answer: "+ans);
    }
}
