import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Basics of Arrays
        // Instead of creating 7 variable we use array

        int[] x = {6,19,7,69,171,5}; // 1st way of creating array

        // Indexing
        System.out.println(x[3]); // 69

        // Updating -> Mutable
        x[3] = 18;
        System.out.println(x[3]); // 18

        // 2nd way of creating array
        int[] x1 = new int[3]; // initialisation
        x1[0] = 18; // declaration
        x1[1] = 45;
        x1[2] = 60;

        // printing all  elements using for loop
        System.out.println(" ");
        System.out.println("Using For Loop:");
        System.out.print("Array x: ");
        for (int i=0; i< x.length; i++){
            System.out.print(x[i]+" ");
        }

        // for each loop
        System.out.println(" \n");
        System.out.println("Using For Each Loop:");
        System.out.print("Array x: ");
        for (int i:x){
            System.out.print(i+" ");
        }

        // Default values
        System.out.println(" \n");
        int[] x3 = new int[6];
        for (int i:x3){
            System.out.print(i+" "); // 0 0 0 0 0 0
        }

        // Input from user
        System.out.println(" \n");
        int[] x4 = new int[5];
        for (int i=0; i<x4.length; i++){
            System.out.printf("Enter %d number: ",i+1);
            x4[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.print("Your array is: ");
        for (int i:x4){
            System.out.print(i+" ");
        }

        // Printing negative number only
        System.out.println(" \n");
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] x5 = new int[n];
        for (int i=0; i<x5.length; i++){
            System.out.printf("Enter %d number: ",i+1);
            x5[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.print("Your negative number in array is: ");
        for (int i:x5){
            if (i<0){
                System.out.print(i+" ");
            }
        }

        // Printing sum of array
        System.out.println(" \n");
        int[] x6 = new int[5];
        for (int i=0; i<x6.length; i++){
            System.out.printf("Enter %d number: ",i+1);
            x6[i] = sc.nextInt();
        }

        System.out.println(" ");
        int sum = 0;
        for (int i:x6){
            sum += i;
        }
        System.out.print("Your sum of array is: "+sum);
    }
}
