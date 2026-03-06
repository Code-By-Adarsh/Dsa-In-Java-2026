public class RDay01 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 1st - Second Largest Element in Array
        System.out.println(" ");
        int[] x1 = {12, 35, 1, 10, 34, 1};
        System.out.print("Given Array: ");
        print(x1);
        // int largest = 0; - bad
        int largest = Integer.MIN_VALUE; // - good
        for (int i=0; i<x1.length; i++){
            if (x1[i] > largest){
                largest = x1[i];
            }
        }

        // int secLargest = 0; - bad
        int secLargest = Integer.MIN_VALUE; // - good
        for (int i=0; i<x1.length; i++){
            if (x1[i] > secLargest && x1[i] != largest){
                secLargest = x1[i];
            }
        }

        System.out.println("Second Largest Element = "+ secLargest);

        // 2nd - Move zero to end
        System.out.println(" ");
        int[] x2 = {0, 1, 0, 3, 12}; // [1,3,12,0,0]
        System.out.print("Given Array: ");
        print(x2);

        int left = 0, right = 0;
        while (right<x2.length){
            if (x2[right] != 0){
                int temp = x2[right];
                x2[right] = x2[left];
                x2[left] = temp;
                left++;
            }
            right++;
        }

        print(x2);
    }
}
