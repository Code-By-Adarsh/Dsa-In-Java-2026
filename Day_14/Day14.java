import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Square fill pattern
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=x1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 2nd - Right half pyramid
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 3rd - Reverse right half pyramid
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=x3+1-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 4rth - Left half pyramid
        System.out.println(" ");
        System.out.print("Enter n(4): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=1; j<=x4-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 5th - Reverse Left half pyramid
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        for (int i=1; i<=x5; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=x5+1-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 6th - K pattern
        System.out.println(" ");
        System.out.print("Enter n(6): ");
        int x6 = sc.nextInt();
        for (int i=1; i<=x6; i++){
            for (int j=1; j<=x6+1-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x6-1; i++){
            for (int j=1; j<=i+1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 7th - Triangle star pattern
        System.out.println(" ");
        System.out.print("Enter n(7): ");
        int x7 = sc.nextInt();
        for (int i=1; i<=x7; i++){
            for (int j=1; j<=x7-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 8th - Reverse Number Triangle Pattern
        System.out.println(" ");
        System.out.print("Enter n(8): ");
        int x8 = sc.nextInt();
        for (int i=1; i<=x8; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            int y8 = i;
            for (int j=1; j<=x8+1-i; j++){
                System.out.print(y8++ +" ");
            }
            System.out.println(" ");
        }

        // 9th - Mirror Image Triangle Pattern
        System.out.println(" ");
        System.out.print("Enter n(9): ");
        int x9 = sc.nextInt();
        for (int i=1; i<=x9; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            int y9 = i;
            for (int j=1; j<=x9+1-i; j++){
                System.out.print(y9++ +" ");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x9-1; i++){
            for (int j=1; j<=x9-1-i; j++){
                System.out.print(" ");
            }
            for (int j=x9-i; j<=x9; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 10th - Hollow Triangle Pattern
        System.out.println(" ");
        System.out.print("Enter n(10): ");
        int x10 = sc.nextInt();
        for (int i=1; i<=x10; i++){
            for (int j=1; j<=x10-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if (j==1 || j==i || i==x10){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
