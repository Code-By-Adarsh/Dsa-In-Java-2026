import java.util.ArrayList;

public class Day32 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int sum = 0;
        for(int right=0; right<arr.length; right++){
            sum += arr[right];
            while(sum>target && left<right){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                list.add(left+1);
                list.add(right+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                if(res.size()==0 || res.get(res.size()-1) != a[i]){
                    res.add(a[i]);
                }
                i++;
                j++;
            }else if(a[i]>b[j]){
                if(res.size()==0 || res.get(res.size()-1) != b[j]){
                    res.add(b[j]);
                }
                j++;
            }else{
                if(res.size()==0 || res.get(res.size()-1) != a[i]){
                    res.add(a[i]);
                }
                i++;
            }
        }

        for(int i1=i; i1<a.length; i1++){
            if(res.get(res.size()-1) != a[i1]){
                res.add(a[i1]);
            }
        }
        for(int j1=j; j1<b.length; j1++){
            if(res.get(res.size()-1) != b[j1]){
                res.add(b[j1]);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        // 1st - Indexes of Subarrays Sum - Sliding Window two pointer approach
        System.out.println(" ");
        int[] x1 = {1,2,3,7,5};
        System.out.print("Given Array: ");
        print(x1);
        System.out.print("Answer: "+subarraySum(x1,12));

        // 2nd - Union of 2 Sorted Array
        System.out.println(" \n");
        int[] x2 = {1,3,5,6};
        int[] y2 = {2,3,4,5,6,7,8,9};
        System.out.print("Array 1: ");
        print(x2);
        System.out.print("Array 2: ");
        print(y2);
        System.out.println("Union of 1 and 2: "+ findUnion(x2,y2));
    }
}
