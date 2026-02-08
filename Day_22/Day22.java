public class Day22 {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void reverse(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // Weekly revision day 1 Feb - 7 Feb

        // 1st - Reverse Array
        System.out.println(" ");
        int[] x1 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x1);
        reverse(x1,0,x1.length-1);
        System.out.print("Reverse Array: ");
        print(x1);

        // 2nd - Rotate Array
        System.out.println(" ");
        int[] x2 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x2);
        int d = 5;
        d = d % x2.length;
        reverse(x2,0,d-1);
        reverse(x2,d,x2.length-1);
        reverse(x2,0,x2.length-1);
        System.out.print("Rotated Array on d = 5: ");
        print(x2);

        // 3rd - 1 variable 2 target
        System.out.println(" ");
        int[] x3 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x3);
        int target = 4;
        int found = -1; // our arrow
        for(int i=0; i<x3.length; i++){
            if (x3[i] == target){
                found = i;
                break;
            }
        }
        if (found != -1){
            System.out.println("Target found at index: "+found);
        }else {
            System.out.println("Target not found");
        }

        // 4rth - Two sum
        System.out.println(" ");
        int[] x4 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x4);
        int target4 = 9;
        boolean flag4 = false;
        for (int i=0; i<x4.length; i++){
            for (int j=i+1; j<x4.length; j++){
                if (x4[i]+x4[j] == target4){
                    flag4 = true;
                    System.out.println("Target found.");
                    break;
                }
            }
            if (flag4){
                break;
            }
        }
        if (!flag4){
            System.out.println(-1);
        }

        // 5th - Second Largest
        System.out.println(" ");
        int[] x5 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x5);
        System.out.print("Second Largest Element: ");
        int min = x5[0];
        for (int i=0; i<x5.length; i++){
            if (x5[i] > min){
                min = x5[i];
            }
        }
        int secMin = x5[0];
        for(int i=0; i<x5.length; i++){
            if (x5[i]> secMin && x5[i] != min){
                secMin = x5[i];
            }
        }
        System.out.print(secMin);
        System.out.println(" ");

        // 6th - Foe Each Loop
        System.out.println(" ");
        int[] x6 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x6);
        System.out.print("Array by for each loop: ");
        for (int ele:x6){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        // 7th - Reverse Copy of Array
        System.out.println(" ");
        int[] x7 = {6,8,1,2,4,9,0};
        System.out.print("Array: ");
        print(x7);
        int[] y7 = new int[x7.length];
        for (int i=x7.length-1; i>=0; i--){
            y7[y7.length-1-i] = x7[i];
        }
        System.out.print("Reverse Array: ");
        print(y7);
    }
}
