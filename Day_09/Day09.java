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
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 3rd - Number square
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=x3; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 4rth - Alphabet square
        System.out.println(" ");
        System.out.print("Enter n(4): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=65; j<65+x4; j++){
                System.out.print((char) j+" ");
            }
            System.out.println(" ");
        }

        // 5th - HW - Alphabet square 2
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        for (int i=1; i<=x5; i++){
            for (int j=97; j<97+x5; j++){
                System.out.print((char) j+" ");
            }
            System.out.println(" ");
        }

        // 6th - Number square 2
        System.out.println(" ");
        System.out.print("Enter n(6): ");
        int x6 = sc.nextInt();
        int y6 = 1;
        for (int i=1; i<=x6; i++){
            for (int j=1; j<=x6; j++){
                System.out.print(y6+" ");
            }
            y6++;
            System.out.println(" ");
        }

        // 7th - HW - Alphabet square 3
        System.out.println(" ");
        System.out.print("Enter n(7): ");
        int x7 = sc.nextInt();
        for (int i=1; i<=x7; i++){
            for (int j=1; j<=x7; j++){
                System.out.print((char) (64+i)+" ");
            }
            System.out.println(" ");
        }

        // 8th - HW - Alphabet square 4
        System.out.println(" ");
        System.out.print("Enter n(8): ");
        int x8 = sc.nextInt();
        for (int i=1; i<=x8; i++){
            for (int j=1; j<=x8; j++){
                if (i%2!=0){
                    System.out.print((char) (96+i)+" ");
                }else {
                    System.out.print((char) (64+i)+" ");
                }
            }
            System.out.println(" ");
        }

        // 9th - Star triangle
        System.out.println(" ");
        System.out.print("Enter n(9): ");
        int x9 = sc.nextInt();
        for (int i=1; i<=x9; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 10th - Number triangle
        System.out.println(" ");
        System.out.print("Enter n(10): ");
        int x10 = sc.nextInt();
        for (int i=1; i<=x10; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 11th - HW - Alphabet triangle
        System.out.println(" ");
        System.out.print("Enter n(11): ");
        int x11 = sc.nextInt();
        for (int i=1; i<=x11; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char) (64+i)+" ");
            }
            System.out.println(" ");
        }

        // 12th - HW - Alphanumeric triangle
        System.out.println(" ");
        System.out.print("Enter n(12): ");
        int x12 = sc.nextInt();
        for (int i=1; i<=x12; i++){
            for (int j=1; j<=i; j++){
                if (i%2!=0){
                    System.out.print(j+" ");
                }else {
                    System.out.print((char) (64+j)+" ");
                }
            }
            System.out.println(" ");
        }

        // 13th - Star triangle horizontally flipped
        System.out.println(" ");
        System.out.print("Enter n(13): ");
        int x13 = sc.nextInt();
        for (int i=1; i<=x13; i++){
            for (int j=1; j<=x13+1-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 14th - Alphabet triangle horizontally flipped
        System.out.println(" ");
        System.out.print("Enter n(14): ");
        int x14 = sc.nextInt();
        int y14 = x14;
        for (int i=1; i<=x14; i++){
            for (int j=1; j<=y14; j++){
                System.out.print((char) (96+j)+" ");
            }
            y14--;
            System.out.println(" ");
        }

        // 15th - Alphabet triangle horizontally flipped 2
        System.out.println(" ");
        System.out.print("Enter n(15): ");
        int x15 = sc.nextInt();
        int y15 = x15;
        for (int i=1; i<=x15; i++){
            for (int j=1; j<=y15; j++){
                System.out.print((char) (64+i)+" ");
            }
            y15--;
            System.out.println(" ");
        }
    }
}
