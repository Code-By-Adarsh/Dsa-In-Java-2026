import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Maximum number in array
        System.out.println(" ");
        int[] x1 = {9,-7,-3,0,100,169,18,45};
        System.out.print("Your array is: ");
        for (int i=0; i<x1.length; i++){
            System.out.print(x1[i]+" ");
        }
        int y1 = x1[0];
        for (int i=1; i<x1.length; i++){
            if (y1<=x1[i]){
                y1 = x1[i];
            }
        }
        System.out.print("\nMaximum number in array is: "+ y1);

        // 2nd - Minimum number in array
        System.out.println(" ");
        int[] x2 = {9,-7,-3,0,100,169,18,45};
        System.out.print("\nYour array is: ");
        for (int i=0; i<x2.length; i++){
            System.out.print(x2[i]+" ");
        }
        int y2 = x2[0];
        for (int i=1; i<x2.length; i++){
            if (y2>=x2[i]){
                y2 = x2[i];
            }
        }
        System.out.print("\nMinimum number in array is: "+ y2);
    }
}
