import java.util.ArrayList;

public class Day44 {

    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            int maxdex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[maxdex] < arr[j]){
                    maxdex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxdex];
            arr[maxdex] = temp;
            list.add(arr[i]);
        }
        return list;
    }

    public static int minSwaps(int arr[]) {
        // Code here
        int ans = 0;
        for(int i=0; i<arr.length-1; i++){
            int mindex = i;
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[mindex] > arr[j]){
                    mindex = j;
                    flag = true;
                }
            }
            if(flag){
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
                ans++;
            }

        }
        return ans;
    }

    public static void binSort(int[] arr) {
        // code here
        int i = 0, j = arr.length-1;
        while (i<j){
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }else if(arr[i] == 0){
                i++;
            }else if(arr[j] == 1){
                j--;
            }
        }
    }

    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        // 1st - K Largest Element - Solved on gfg
        // throws tle error
        System.out.println(" ");
        int[] x1 = {23,56,45,98,80,11,78};
        System.out.print("Given Array: ");
        print(x1);
        int k = 4;
        System.out.println("Answer: "+kLargest(x1,k));

        // 2nd - Minimum swaps to sort - Solved on gfg
        // throws tle error
        System.out.println(" ");
        int[] x2 = {5,8,6,3,4};
        System.out.print("Given Array: ");
        print(x2);
        System.out.print("Answer: "+minSwaps(x2));

        // 3rd - Binary Array Sorting -- Solved on gfg
        System.out.println("\n ");
        int[] x3 = {1,0,1,1,0};
        System.out.print("Given Array: ");
        print(x3);
        binSort(x3);
        System.out.print("Answer: ");
        print(x3);

        // 4rth - Intersection of two sorted arrays -- Solved on gfg
        System.out.println(" ");
        int[] x4 = {1,2,3,4};
        int[] y4 = {2,4,6,7,8};
        System.out.print("Array1: ");
        print(x4);
        System.out.print("Array2: ");
        print(y4);
        System.out.println("Answer: "+intersection(x4,y4));
    }
}
