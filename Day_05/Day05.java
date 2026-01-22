import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1st - Loop : What and why?
        System.out.println(" ");
        for (int i=1; i<=5; i++){
            System.out.println(i+". "+"Good Evening");
        }

        // 2nd - Printing 1 to 10 number
        System.out.println(" ");
        for(int i=1; i<=10; i++){
            System.out.print(i+" ");
        }

        // 3rd - Understanding Concept
        System.out.println(" \n");
        int x = 1;
        for (x=1; x<=5; x++){
            System.out.print(x+" ");
        }
        System.out.println("Over : "+x);

        // 4rth - Printing from user input
        System.out.println(" ");
        System.out.print("Enter your number: ");
        int x1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            System.out.print("Adarsh ");
        }

        // 5th - Even number from 1 to 100
        System.out.println(" \n");
        System.out.println("Even Numbers:");
        System.out.println("Bad way(100 times chalunga):");
        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nGood way(50 times chalunga):");
        for (int i=2; i<=100; i+=2){
            System.out.print(i+" ");
        }

        // 6th - Odd number from 1 to 100
        System.out.println(" \n");
        System.out.println("Odd Numbers:");
        System.out.println("Bad way(100 times chalunga):");
        for (int i=1; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nGood way(50 times chalunga):");
        for (int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }

        // 7th - 17 table
        System.out.println(" \n");
        System.out.println("17th table:");
        for (int i=1; i<=10; i++){
            System.out.print(i*17 + " ");
        }

        // 8th - Odd number from 1 to 100 divisible by 3
        System.out.println(" \n");
        System.out.println("Odd Numbers divisible by 3:");
        for (int i=1; i<=100; i++){
            if (i%2!=0 && i%3==0){
                System.out.print(i+" ");
            }
        }

        // 9th - Print n to 1
        System.out.println(" \n");
        System.out.print("Enter number: ");
        int x2 = sc.nextInt();
        for (int i=x2; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
