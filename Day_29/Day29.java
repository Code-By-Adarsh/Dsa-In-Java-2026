import java.util.ArrayList;
import java.util.Collections;

public class Day29 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // Weekly revision - 9 Feb to 14 Feb
        // 1st - Missing number - Smart Approach
        System.out.println(" ");
        int[] x1 = {1,2,4,5};
        System.out.print("Array: ");
        print(x1);
        int n1 = x1.length+1;
        int totalSum1 = n1*(n1+1)/2;
        int sumArray1 = 0;
        for(int ele:x1){
            sumArray1 += ele;
        }
        System.out.println("Missing Number: "+(totalSum1-sumArray1));

        // 2nd - Segregate 0s and 1s - Swipe and two pointer approach
        System.out.println(" ");
        int[] x2 = {0,1,1,1,0,1};
        System.out.print("Array: ");
        print(x2);
        int i2 = 0, j2 = x2.length-1;
        while (i2<j2){
            if (x2[i2]==0 && x2[j2]==1){
                int temp = x2[i2];
                x2[i2] = x2[j2];
                x2[j2] = temp;
                i2++;
                j2--;
            } else if (x2[i2]==1) {
                i2++;
            } else if (x2[j2]==0) {
                j2--;
            }
        }
        System.out.print("Answer Array: ");
        print(x2);

        // 3rd - Wave Array
        System.out.println(" ");
        int[] x3 = {2,5,7,9,10,15,20};
        System.out.print("Array: ");
        print(x3);
        for (int i=0; i<x3.length-1; i+=2){
            int temp = x3[i];
            x3[i] = x3[i+1];
            x3[i+1] = temp;
        }
        System.out.print("Answer Array: ");
        print(x3);

        // 4rth - Adding one to array
        System.out.println(" ");
        int[] x4 = {5,6,2,5};
        System.out.print("Array: ");
        print(x4);
        ArrayList<Integer> list4 = new ArrayList<>();
        int carry4 = 1;
        for (int i=x4.length-1; i>=0; i--){
            if (x4[i]+carry4<=9){
                list4.add(x4[i]+carry4);
                carry4 = 0;
            }else {
                list4.add(0);
                carry4 = 1;
            }
        }
        Collections.reverse(list4);
        if (carry4 == 1){
            list4.add(0,1);
        }
        System.out.print("Answer Array: ");
        System.out.println(list4);

        // 5th - Merge two sorted array
        System.out.println(" ");
        int[] x5 = {2,3,7,8};
        System.out.print("Array 1: ");
        print(x5);
        int[] y5 = {1,4};
        System.out.print("Array 2: ");
        print(y5);
        int[] z5 = new int[x5.length+y5.length];
        int i5 = x5.length-1, j5 = y5.length-1, k5 = z5.length-1;
        while (i5>=0 && j5>=0){
            if (x5[i5]>y5[j5]){
                z5[k5] = x5[i5];
                i5--;
            }else {
                z5[k5] = y5[j5];
                j5--;
            }
            k5--;
        }

        for (int a5=i5; a5>=0; a5--){
            z5[k5] = x5[a5];
        }
        for (int b5=j5; b5>=0; b5--){
            z5[k5] = y5[b5];
        }
        System.out.print("Merge Answer Array: ");
        print(z5);
    }
}
