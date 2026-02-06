import java.util.Scanner;

public class Day20 {
    public static void print(int[] arr){
        System.out.print("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - 1 variable 2 work
        System.out.println(" ");
        int[] x1 = {3,5,2,5,4,7,6,4,56,45,35};
        print(x1);
        System.out.print("Enter target: ");
        int target1 = sc.nextInt();
        int found = -1; // at place of flag and x = 0;
        for(int i=0; i<x1.length; i++){
            if (target1 == x1[i]){
                found = i;
                break;
            }
        }
        if (found != -1){
            System.out.println("Target mil gya bhai at index: "+found);
        }else{
            System.out.println("Target nhi mila bhai");
        }

        // 2nd - two sum
        System.out.println(" ");
        int[] x2 = {1,5,8,-3};
        print(x2);
        int target2 = 0;
        boolean flag2 = false;
        for(int i=0; i<x2.length; i++){
            for (int j=i+1; j<x2.length; j++){
                if(x2[i]+x2[j] == target2){
                    System.out.print("i: "+i+" j: "+j);
                    flag2 = true;
                    break;
                }
            }
            if (flag2){
                break;
            }
        }
        if (!flag2){
            System.out.println(-1);
        }

        // 3rd - Second largest element
        System.out.println(" ");
        int[] x3 = {4,6,3,54,76,89,65,89,45,9,87,45};
        print(x3);
        int y3 = x3[0];
        for(int i=0; i<x3.length; i++){
            if(y3<x3[i]){
                y3 = x3[i];
            }
        }
        int a3 = x3[0];
        for(int i=0; i<x3.length; i++){
            if(a3 < x3[i] && x3[i] != y3){
                a3 = x3[i];
            }
        }
        System.out.println(a3);

        // by 1 loop
        /*
        Arrays.sort(arr);
        boolean flag = false;
        int b = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(b != arr[i]){
                b = arr[i];
                flag = true;
                System.out.println(b);
                break;
            }
        }
        if(!flag){
        sout(-1);
        }
         */

        // 4rth - For Each Loop
        System.out.println(" ");
        int[] x4 = {5,6,7,4,3,0,9,5,6,7,1,2,6};
        print(x4);
        for(int ele:x4){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        // 5th - Make Reverse array copy of real array
        System.out.println(" ");
        int[] x5 = {6,5,4,7,9};
        int[] y5 = new int[x5.length];
        System.out.println("Before Reverse: ");
        print(x5);
        for(int i=x5.length-1; i>=0; i--){
            int j = (x5.length-1)-i;
            y5[j] = x5[i];
        }
        System.out.println("After Reverse: ");
        print(y5);
    }
}
