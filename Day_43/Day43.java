import java.util.ArrayList;

public class Day43 {

    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void checkArraySort(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Yes, brother array is sorted.");
        }else {
            System.out.println("Array is not sorted brother.");
        }
    }

    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    public static void reverseBubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    public static ArrayList<Integer> pairOfSum(int[] arr,int k){
        int i = 0, j = arr.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<j){
            if(arr[i]+arr[j] > k){
                j--;
            } else if (arr[i]+arr[j] < k) {
                i++;
            }else{
                list.add(i);
                list.add(j);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }


    public static void main(String[] args) {

        // Weekly Revision - 23 Feb to 28 Feb
        // 1st - Check Array is Sorted
        System.out.println(" ");
        int[] x1 = {2,4,8,9,10,35,70};
        System.out.print("Given Array: ");
        print(x1);
        System.out.print("Answer: ");
        checkArraySort(x1);

        // 2nd - Bubble Sorting Algorithm
        System.out.println(" ");
        int[] x2 = {2,4,8,0,10,3,7};
        System.out.print("Given Array: ");
        print(x2);
        System.out.print("Answer: ");
        bubbleSort(x2);
        print(x2);

        // 3rd - Bubble Sorting in reverse order
        System.out.println(" ");
        int[] x3 = {1,4,2,5,9,0,6,5,4};
        System.out.print("Given Array: ");
        print(x3);
        System.out.print("Answer: ");
        reverseBubbleSort(x3);
        print(x3);

        // 4rth - Move all zeros to end - TC : O(n) and AS : O(1) approach
        System.out.println(" ");
        int[] x4 = {3,0,0,7,8,0,2,0,5};
        System.out.print("Given Array: ");
        print(x4);

        int index = 0;
        for(int i=0; i<x4.length; i++){
            if(x4[i] != 0){
                x4[index] = x4[i];
                index++;
            }
        }

        while(index < x4.length){
            x4[index] = 0;
            index++;
        }

        System.out.print("Answer: ");
        print(x4);

        // 5th - Move all zeros to end - Window sliding approach - TC: O(n) and AS: O(1)
        System.out.println(" ");
        int[] x5 = {3,0,0,7,8,0,2,0,5};
        System.out.print("Given Array: ");
        print(x5);

        int left = 0, right = 0;
        while(right<x5.length){
            if(x5[right] == 0){
                right++;
            }else{
                int temp = x5[right];
                x5[right] = x5[left];
                x5[left] = temp;
                left++;
                right++;
            }
        }

        System.out.print("Answer: ");
        print(x5);

        // 6th - Selection Sorting Algorithm
        System.out.println(" ");
        int[] x6 = {5,3,7,0,9,2,6,1};
        System.out.print("Given Array: ");
        print(x6);

        for(int i=0; i<x6.length-1; i++){
            int mindex = i;
            for(int j=i+1; j<x6.length; j++){
                if(x6[mindex] > x6[j]){
                    mindex = j;
                }
            }

            int temp = x6[i];
            x6[i] = x6[mindex];
            x6[mindex] = temp;
        }

        System.out.print("Answer: ");
        print(x6);

        // 7th - Pair of sum in sorted array - Two pointer approach
        // Time Complexity : O(n)
        System.out.println(" ");
        int[] x7 = {2,7,11,15};
        System.out.print("Given Array: ");
        print(x7);
        System.out.println("Answer: "+pairOfSum(x7,13));

        // 8th - Insertion Sorting Algorithm
        System.out.println(" ");
        int[] x8 = {4,1,7,3,9,2,0,8};
        System.out.print("Given Array: ");
        print(x8);

        for(int i=1; i<x8.length; i++){
            int j = i;
            while (j>0){
                if (x8[j] < x8[j-1]){
                    int temp = x8[j];
                    x8[j] = x8[j-1];
                    x8[j-1] = temp;
                }
                j--;
            }
        }

        System.out.print("Answer: ");
        print(x8);
    }
}
