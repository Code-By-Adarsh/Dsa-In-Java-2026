import java.util.Scanner;

public class Day09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Star rectangle
        System.out.println(" ");
        System.out.print("Enter rows: ");
        int x1 = sc.nextInt();
        System.out.print("Enter columns: ");
        int y1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=y1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 2nd - HW - Star square
        System.out.println(" ");
        System.out.print("Enter n: ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 3rd - Number square
        System.out.println(" ");
        System.out.print("Enter n: ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=x3; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 4rth - Alphabet square
        System.out.println(" ");
        System.out.print("Enter n: ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=65; j<65+x4; j++){
                System.out.print((char) j+" ");
            }
            System.out.println(" ");
        }
    }
}
