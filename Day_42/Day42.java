public class Day42 {

    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {


        // 1st - Insertion Sorting
        System.out.println(" ");
        int[] x1 = {4,1,7,3,9,2,0,8};
        System.out.print("Given Array: ");
        print(x1);
        for (int i=1; i<x1.length; i++){
            int j = i;
            while (j>0 && x1[j] < x1[j-1]){
                int temp = x1[j];
                x1[j] = x1[j-1];
                x1[j-1] = temp;
                j--;
            }
        }
        System.out.print("Answer: ");
        print(x1);

        // 2nd - Sorted Insert Position --> Solved at GFG

        // 3rd - Floor in a sorted array --> Solved at GFG

        // <--------------------Sorting Finished-------------------------->
    }
}
