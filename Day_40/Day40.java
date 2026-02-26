import java.util.ArrayList;
import java.util.Arrays;

public class Day40 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] > target){
                j--;
            }else if(arr[i]+arr[j] < target){
                i++;
            }else{
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }

        list.add(-1);
        list.add(-1);
        return list;
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a); // mlogm
        Arrays.sort(b); // nlogn
        int i = 0, j = 0;
        while(i<a.length && j<b.length){ // m+n
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                i++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        // 1st - Selection sort find largest
        System.out.println(" ");
        int[] x1 = {3,7,1,0,9};
        System.out.print("Given Array: ");
        print(x1);

        for (int i=0; i<x1.length; i++){
            int maxdex = x1.length-1-i;
            for (int j=0; j<x1.length-1-i; j++){
                if (x1[maxdex] < x1[j]){
                    maxdex = j;
                }
            }
            int temp = x1[x1.length-1-i];
            x1[x1.length-1-i] = x1[maxdex];
            x1[maxdex] = temp;
        }

        System.out.print("Answer: ");
        print(x1);

        // 2nd - Pair of sum in sorted array - Two pointer approach
        // Time Complexity : O(n)
        System.out.println(" ");
        int[] x2 = {2,7,11,15};
        System.out.print("Given Array: ");
        print(x2);
        System.out.println("Answer: "+twoSum(x2,9));

        // 3rd - Common Elements
        System.out.println(" ");
        int[] x3 = {3,4,2,2,4};
        System.out.print("Array 1: ");
        print(x3);
        int[] y3 = {3,2,2,7};
        System.out.print("Array 2: ");
        print(y3);
        System.out.println("Answer: "+commonElements(x3,y3));
    }
}
