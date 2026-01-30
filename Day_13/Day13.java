import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Square Hollow Pattern
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=x1; j++){
                if (i==1 || i==x1 || j==1 || j==x1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 2nd - Number Triangular
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        // 3rd - Number Increasing Pyramid
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 4rth - Number Increasing Reverse Pyramid
        System.out.println(" ");
        System.out.print("Enter n(4): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=1; j<=x4+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 5th - Number changing pyramid
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        int y5 = 1; // helper variable
        for (int i=1; i<=x5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(y5+" ");
                y5++;
            }
            System.out.println(" ");
        }

        // 6th - Zero-One Triangle
        System.out.println(" ");
        System.out.print("Enter n(6): ");
        int x6 = sc.nextInt();
        for (int i=1; i<=x6; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 == 0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println(" ");
        }

        // 7th - Palindrome Triangular
        System.out.println(" ");
        System.out.print("Enter n(7): ");
        int x7 = sc.nextInt();
        for (int i=1; i<=x7; i++){
            for (int j=1; j<=x7-i; j++){
                System.out.print("  ");
            }
            int y7 = i; // helping variable
            for (int j=1; j<=i*2-1; j++){
                if (j<i){
                    System.out.print(y7+" ");
                    y7--;
                }else if (j==i){
                    System.out.print(y7+" ");
                    y7++;
                } else {
                    System.out.print(y7+" ");
                    y7++;
                }
            }
            System.out.println(" ");
        }

        // 8th - Rhombus Pattern
        System.out.println(" ");
        System.out.print("Enter n(8): ");
        int x8 = sc.nextInt();
        for (int i=1; i<=x8; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=x8-1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 9th - Diamond Pattern
        System.out.println(" ");
        System.out.print("Enter n(9): ");
        int x9 = sc.nextInt();
        for (int i=1; i<=x9; i++){
            for (int j=1; j<=x9+1-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x9-1; i++){
            for (int j=1; j<=i+1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=x9-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 10th - Butterfly Star Pattern
        System.out.println(" ");
        System.out.print("Enter n(10): ");
        int x10 = sc.nextInt();
        for(int i=1; i<=x10; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=x10*2-1-2*i; j++){
                System.out.print("  ");
            }
            int y10 = i;
            if (y10 == x10){
                y10 = y10 - 1;
            }
            for (int j=1; j<=y10; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        int z10 = 1; // helping variable
        for (int i=1; i<=x10-1; i++){
            for (int j=1; j<=x10-i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=z10; j++){
                System.out.print("  ");
            }
            z10+=2;
            for (int j=1; j<=x10-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
