import java.util.Arrays;
import java.util.Scanner;

public class Day19 {

    public static void change(int[] x){
        x[4] = 10;
    }

    public static void print(int[] x){
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1st - Array of different data types (default value)
        char ch = '\0';
        System.out.println((int) ch);
        char[] a = new char[5]; // default value:
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println(" ");
        double[] b = new double[5]; // default value:0.0 0.0 0.0 0.0 0.0
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }

        System.out.println(" ");
        String[] c = new String[5]; // default value:null null null null null
        for (int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }

        // 2nd - Important concept - Pass by reference
        System.out.println(" \n");
        int[] x2 = {3,6,5,8,9,7};
        System.out.println(x2[4]);
        change(x2);
        System.out.println(x2[4]);

        // 3rd - Shallow Copy
        System.out.println(" ");
        int[] x3 = {10,20,30};
        System.out.println(x3[0]);
        int[] y3 = x3;
        y3[0] = 100;
        System.out.println(x3[0]);

        // 4rth - Deep Copy
        System.out.println(" ");
        int[] x4 = {10,20,30};
        System.out.println(x4[0]);
        int[] y4 = Arrays.copyOf(x4,2);
        y4[0] = 100;
        System.out.println(x4[0]);

        // 5th - Sort ascending order
        System.out.println(" ");
        int[] x5 = {5,7,2,1,-6,7};
        print(x5);
        Arrays.sort(x5);
        print(x5);

        // 6th - HW
        System.out.println(" ");
        int[] x6 = {10,20,30,40,50};
        for (int i=0; i<x6.length; i++){
            if (i%2 != 0){
                x6[i] *= 2;
            }else {
                x6[i] += 10;
            }
        }
        print(x6);

        // 7th - HW -Searching an element
        System.out.println(" ");
        int[] x7 = {1,4,5,2,5,7,35,63,64,78,32,32,56,75,75,33,25,87};
        System.out.print("Enter element: ");
        int y7 = sc.nextInt();
        boolean flag = true;
        for (int i=0; i<x7.length; i++){
            if (y7 == x7[i]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Nahi hai. "+y7);
        }else {
            System.out.println("Ha bhai hai. "+y7);
        }
    }
}
