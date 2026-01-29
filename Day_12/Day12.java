import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Diamond - Method 1
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        int nsp1 = x1-1;
        int nst1 = 1;
        int nsp2 = 1;
        int nst2 = 2*x1-3;
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=nsp1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=nst1; j++){
                System.out.print("* ");
            }
            nsp1--;
            nst1 += 2;
            System.out.println(" ");
        }

        for (int i=1; i<=x1-1; i++){
            for (int j=1; j<=nsp2; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=nst2; j++){
                System.out.print("* ");
            }
            nsp2++;
            nst2 -= 2;
            System.out.println(" ");
        }

        // 2nd - Diamond - Method 2
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i=1; i<=x2-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=(2*x2-1)-2*i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 3rd - Bridge
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3*2-1; i++){
            System.out.print("* ");
        }
        System.out.println(" ");

        for (int i=1; i<=x3-1; i++){
            for (int j=1; j<=x3-i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=x3-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
