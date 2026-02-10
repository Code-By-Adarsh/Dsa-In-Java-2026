public class Day24 {
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 1 pass solution
        // 1st - Segregate 0s and 1s (Method -2) and M-1 in day 23
        System.out.println(" ");
        int[] x1 = {1,0,1,0,1,0,0};
        System.out.print("Array: ");
        print(x1);
        int i1 = 0, j1 = x1.length-1;
        while (i1<j1){
            if (x1[i1]==1 && x1[j1]==0){
                int temp = x1[i1];
                x1[i1] = x1[j1];
                x1[j1] = temp;
                i1++;
                j1--;
            }
            if (x1[i1]==0){
                i1++;
            }
            if (x1[j1]==1){
                j1--;
            }
        }
        System.out.print("Answer: ");
        print(x1);

        // 2nd - Wave Array
        System.out.println(" ");
        int[] x2 = {1,2,3,4,5,6,7};
        System.out.print("Array: ");
        print(x2);
        for(int i=0; i<x2.length; i+=2){
            if(i != x2.length-1){
                int temp = x2[i];
                x2[i] = x2[i+1];
                x2[i+1] = temp;
            }
        }
        System.out.print("Answer: ");
        print(x2);
    }
}
