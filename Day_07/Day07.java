import java.util.Scanner;

public class Day07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Printing all factors
        System.out.println(" ");
        System.out.print("Enter your number: ");
        int x1 = sc.nextInt();
        System.out.print("Factors(bad code):");
        for (int i=1; i<=x1; i++){
            if (x1%i==0){
                System.out.print(" "+i);
            }
        }

        System.out.println(" \n");
        System.out.print("Factors(good code):");
        for (int i=1; i<=Math.sqrt(x1); i++){
            if (x1%i==0){
                if (i==Math.sqrt(x1)){
                    System.out.print(" "+i);
                }else {
                    System.out.print(" "+i+" "+x1/i);
                }
            }
        }

        // 2nd - Continue
        System.out.println(" \n");
        for (int i=1; i<=100; i++){
            if (i%2!=0){
                continue; // skip this iteration
            }
            System.out.print(i+" ");
        }

        // 3rd - While loop
        System.out.println(" \n");
        int x3 = 1;
        while (x3<=10){
            System.out.print(x3+" ");
            x3++;
        }

        // 4rth - Do-while loop
        System.out.println(" \n");
        int x4 = 1;
        do {
            System.out.print(x4+" ");
            x4++;
        }while (x4<=10);
    }
}
