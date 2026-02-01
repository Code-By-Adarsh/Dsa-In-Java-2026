import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Hollow Reverse Triangle Pattern
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=x1+1-i; j++){
                if (i==1 || j==x1+1-i || j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 2nd - Hollow Diamond Pyramid
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x2-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=x2-i; j++){
                if (j==1 || j==x2-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 3rd - Hollow Hourglass Pattern
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=x3+1-i; j++){
                if (i==1 || j==1 || j==x3+1-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x3-1; i++){
            for (int j=1; j<=x3-1-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i+1; j++){
                if (j==1 || j==i+1 || i==x3-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 4rth - Pascal's Triangle
        System.out.println(" ");
        System.out.print("Enter n(4): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=1; j<=x4-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print(1+" ");
                }else {
                    System.out.print(i-1+" ");
                }
            }
            System.out.println(" ");
        }

        // 5th - Right Pascal's Triangle
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        for (int i=1; i<=x5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=x5-1; i++){
            for (int j=1; j<=x5-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
