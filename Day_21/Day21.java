public class Day21 {
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

        // 1st - Reverse Array
        System.out.println(" ");
        int[] x1 = {3,19,56,9,83,18,24,85,14};
        System.out.print("Array: ");
        print(x1);
        int i = 0, j = x1.length-1;
        System.out.print("Reverse Array: ");
        while (i<j){
            int temp = x1[i];
            x1[i] = x1[j];
            x1[j] = temp;
            i++;
            j--;
        }
        print(x1);

        // 2nd - Rotate Array
        System.out.println(" ");
        int[] x2 = {3,19,56,9};
        int[] y2 = {3,19,56,9};
        int d = 3; // 9,3,19,56
        int d1 = 10; // 56,19,3,19
        int n = x2.length;
        d1 = d1 % n;
        System.out.print("Array: ");
        print(x2);
        reverse(x2,0,d-1);
        reverse(x2,d,n-1);
        reverse(x2,0,n-1);
        System.out.print("Rotated Array on d = 3: ");
        print(x2);
        System.out.print("Array: ");
        print(y2);
        reverse(y2,0,d1-1);
        reverse(y2,d1,n-1);
        reverse(y2,0,n-1);
        System.out.print("Rotated Array on d = 10: ");
        print(y2);
    }
}
