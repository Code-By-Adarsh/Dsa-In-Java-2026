import java.util.ArrayList;
import java.util.HashSet;

public class Day33 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void rotate1(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        // 1st - Rotate Array One by One
        System.out.println(" ");
        int[] x1 = {1,2,3,4,5};
        int n = x1.length;
        int d = n-1;
        System.out.print("Array: ");
        print(x1);
        rotate1(x1,0,d-1);
        rotate1(x1,d,n-1);
        rotate1(x1,0,n-1);
        System.out.print("Rotated Array: ");
        print(x1);

        // 2nd - Remove Duplicates Sorted Array
        System.out.println(" ");
        int[] x2 = {1,2,2,3,4,5,5,6};
        System.out.print("Given Array: ");
        print(x2);
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<x2.length; i++){
            if(list2.size() == 0 || list2.get(list2.size()-1) != x2[i]){
                list2.add(x2[i]);
            }
        }
        System.out.print("Answer Array: "+list2);

        // 3rd - Value equal to index value
        System.out.println("\n ");
        int[] x3 = {1,7,8,4,5};
        System.out.print("Given Array: ");
        print(x3);
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0; i<x3.length; i++){
            if(x3[i] == i+1){
                list3.add(i+1);
            }
        }
        System.out.print("Answer: "+list3);

        // 4rth - Intersections of Arrays with Distinct
        System.out.println("\n ");
        int[] x4 = {4,6,7,8,9};
        int[] y4 = {1,2,4,6,7};
        System.out.print("Array 1: ");
        print(x4);
        System.out.print("Array 2: ");
        print(y4);
        HashSet<Integer> set = new HashSet<>();
        for(int x:x4){
            set.add(x);
        }

        int count = 0;

        for(int x:y4){
            if(set.contains(x)){
                count++;
            }
        }

        System.out.println("Answer: "+count);
    }
}
