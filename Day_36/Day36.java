import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Day36 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static ArrayList<Integer> getAlternate(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i+=2){
            list.add(arr[i]);
        }
        return list;
    }

    public static void moveZeroToEnd(int[] arr){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index<arr.length){
            arr[index] = 0;
            index++;
        }
    }

    public static int numberOfOccurrence(int[] arr, int target){
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
                answer++;
            }
        }
        return answer;
    }

    public static ArrayList<Integer> firstAndLastOccurrence(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = arr.length-1;
        while (i<=j){
            if (arr[i] != target && arr[j] != target){
                i++;
                j--;
            }else if (arr[i] != target && arr[j] == target){
                i++;
            } else if (arr[i] == target && arr[j] != target) {
                j--;
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

    public static void rotateArray(int[] arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static ArrayList<Integer> removeDuplicateInSortedArray(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i< arr.length; i++){
            if (list.size() == 0 || list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static ArrayList<Integer> valueEqualToIndex(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == i){
                list.add(i+1);
            }
        }
        return list;
    }

    public static ArrayList<Integer> subarraySym(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int sum = 0;
        for (int right=0; right<arr.length; right++){
            sum += arr[right];

            while (sum>target && left<right){
                sum -= arr[left];
                left++;
            }

            if (sum ==  target){
                list.add(left);
                list.add(right);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }

    public static ArrayList<Integer> union(int[] a, int[] b){
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<a.length && j<b.length){
            if (a[i]>b[j]){
                if (list.size() == 0 || list.get(list.size()-1) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }else {
                if (list.size() == 0 || list.get(list.size()-1) != a[i]){
                    list.add(a[i]);
                }
                i++;
            }
        }

        for (int i1=i; i1<a.length; i1++){
            if (list.get(list.size()-1) != a[i1]){
                list.add(a[i1]);
            }
        }
        for (int j1=j; j1<b.length; j1++){
            if (list.get(list.size()-1) != b[j1]){
                list.add(b[j1]);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        // Weekly Revision - 16 Feb to 21 Feb
        // 1st - Get Alternate
        System.out.println(" ");
        int[] x1 = {2,5,7,3,5,6,9,0,1};
        System.out.print("Given Array: ");
        print(x1);
        System.out.println("Answer: "+getAlternate(x1));

        // 2nd - Move all 0s to end
        System.out.println(" ");
        int[] x2 = {1,2,0,4,0,0,5};
        System.out.print("Given Array: ");
        print(x2);
        moveZeroToEnd(x2);
        System.out.print("Answer: ");
        print(x2);

        // 3rd - Number of occurrence
        System.out.println(" ");
        int[] x3 = {1,0,0,0,5,0,7,0,9,0,2,3,5,6,0,0,7,0,9,0,6};
        System.out.print("Given Array: ");
        print(x3);
        System.out.println("Answer: "+numberOfOccurrence(x3,0));

        // 4rth - First and last occurrence
        System.out.println(" ");
        int[] x4 = {1,2,3,6,7,8,5,6,9,0,7,3,4,5};
        System.out.print("Given Array: ");
        print(x4);
        System.out.println("Answer: "+firstAndLastOccurrence(x4,7));

        // 5th - Rotate Array One by One
        System.out.println(" ");
        int[] x5 = {2,3,5,6,4,7,8,0};
        System.out.print("Given Array: ");
        print(x5);
        int n = x5.length;
        int d = n-1;
        rotateArray(x5,0,d-1);
        rotateArray(x5,0,n-1);
        System.out.print("Answer: ");
        print(x5);

        // 6th - Remove Duplicate Sorted Array
        System.out.println(" ");
        int[] x6 = {1,2,2,3,4,4,5,6,6,7};
        System.out.print("Given Array: ");
        print(x6);
        System.out.println("Answer: "+removeDuplicateInSortedArray(x6));

        // 7th - Value Equal to Index
        System.out.println(" ");
        int[] x7 = {1,5,4,6,3,5,6,7,8,2,3,4};
        System.out.print("Given Array: ");
        print(x7);
        System.out.println("Answer: "+valueEqualToIndex(x7));

        // 8th - Intersections of Arrays With Distinct
        System.out.println(" ");
        int[] x8 = {1,4,3,6,5};
        int[] y8 = {2,4,3,5,9};
        System.out.print("Array 1: ");
        print(x8);
        System.out.print("Array 2: ");
        print(y8);
        HashSet<Integer> set = new HashSet<>();
        for (int ele:x8){
            set.add(ele);
        }

        int count = 0;
        for (int ele:y8){
            if (set.contains(ele)){
                count++;
            }
        }
        System.out.println("Answer: "+count);

        // 9th - Indexes of Subarrays sum - Sliding window two pointer approach
        System.out.println(" ");
        int[] x9 = {1,2,3,7,5};
        System.out.print("Given Array: ");
        print(x9);
        System.out.println("Answer: "+subarraySym(x9,7));

        // 10th - Union of two sorted array
        System.out.println(" ");
        int[] x10 = {1,2,3,4,5,12,14,20};
        int[] y10 = {11,13,14,16,20,70,90,100};
        System.out.print("Array 1: ");
        print(x10);
        System.out.print("Array 2: ");
        print(y10);
        System.out.println("Answer: "+union(x10,y10));
    }
}
