public class Day28 {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void merge(int[] c, int[] a, int[] b){
        int i = a.length-1, j = b.length-1, k = c.length-1;
        while (i>=0 && j>=0){
            if (a[i]>b[j]){
                c[k] = a[i];
                i--;
            }else {
                c[k] = b[j];
                j--;
            }
            k--;
        }

        for (int i1=i; i1>=0; i1--){
            c[k] = a[i1];
            k--;
        }

        for (int j1=j; j1>=0; j1--){
            c[k] = b[j1];
            k--;
        }
    }

    public static void main(String[] args) {

        // 1st - HW - Merge in reverse order
        System.out.println(" ");
        int[] x1 = {2,5,6,9,20};
        System.out.print("Array a: ");
        print(x1);
        int[] y1 = {1,3,4,5,7,8};
        System.out.print("Array b: ");
        print(y1);
        int[] z1 = new int[x1.length+y1.length];
        merge(z1,x1,y1);
        System.out.print("Merge Array: ");
        print(z1);

        // ----------------Time Complexity-----------------
        // 2nd - Duplicate number - Approach 1 - Brute Force
        System.out.println(" ");
        int[] x2 = {5,1,3,4,2,4};
        System.out.print("Array: ");
        print(x2);
        for (int i=0; i<x2.length; i++){
            boolean flag = false;
            for (int j=i+1; j<x2.length; j++){
                if (x2[i] == x2[j]){
                    System.out.println("Duplicate element: "+x2[i]);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        // 3rd - Duplicate number - Approach 2 - Marking in another array
        System.out.println(" ");
        int[] x3 = {5,1,3,4,2,4};
        System.out.print("Array: ");
        print(x3);
        boolean[] flag3 = new boolean[x3.length];
        for (int i=0; i<x3.length; i++){
            if (flag3[x3[i]]){
                System.out.println("Duplicate element: "+x3[i]);
                break;
            }else {
                flag3[x3[i]] = true;
            }
        }

        // 4rth - Duplicate number - Approach 3 - Most optimized approach
        System.out.println(" ");
        int[] x4 = {5,1,3,4,2,4};
        System.out.print("Array: ");
        print(x4);
        int sumArray = 0;
        for (int ele:x4){
            sumArray += ele;
        }
        int totalSum = 5*6/2;
        System.out.println("Duplicate element: "+(sumArray-totalSum));
    }
}
