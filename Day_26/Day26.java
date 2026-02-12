public class Day26 {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void merge(int[] z1, int[] x1, int[] y1){
        int i = 0, j = 0, k = 0;
        while (i<x1.length && j<y1.length){
            if (x1[i]<y1[j]){
                z1[k] = x1[i];
                i++;
            }else {
                z1[k] = y1[j];
                j++;
            }
            k++;
        }
        if (i==x1.length){
            while (j<y1.length){
                z1[k] = y1[j];
                j++;
                k++;
            }
        }else {
            while (i<x1.length){
                z1[k] = x1[i];
                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {

        // 1st - HW - {3,5,2,8,7} + {9,2,1} = {3,6,1,2,8}

        // 2nd - Merge two sorted Array
        System.out.println(" ");
        int[] x1 = {2,5,6,8,9,10};
        System.out.print("Array 1: ");
        print(x1);

        int[] y1 = {1,3,4,7,11,12,13};
        System.out.print("Array 2: ");
        print(y1);

        int[] z1 = new int[x1.length+y1.length];
        System.out.print("Array before merging: ");
        print(z1);

        merge(z1,x1,y1);
        System.out.print("Array after merging: ");
        print(z1);
    }
}
