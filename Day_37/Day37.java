public class Day37 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void isArraySorted(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Yes, brother array is sorted.");
        }else {
            System.out.println("Array is not sorted brother.");
        }
    }

    public static void main(String[] args) {

        // 1st - Check array is sorted
        System.out.println(" ");
        int[] x1 = {1,1,2,3,4,4,7,6};
        System.out.print("Given Array: ");
        print(x1);
        System.out.print("Answer: ");
        isArraySorted(x1);

        // 2nd - Bubble sort (basic)
        System.out.println(" ");
        int[] x2 = {5,1,4,3,0,-1,1,2};
        int n = x2.length;
        System.out.print("Given Array: ");
        print(x2);
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (x2[j] > x2[j+1]){
                    int temp = x2[j];
                    x2[j] = x2[j+1];
                    x2[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        print(x2);

        // 3rd - Bubble sort (basic+)
        System.out.println(" ");
        int[] x3 = {5,1,4,3,0,-1,1,2};
        int n3 = x3.length;
        System.out.print("Given Array: ");
        print(x3);
        for (int i=0; i<n3-1; i++){
            boolean isSorted = true;
            for (int j=0; j<n3-1; j++){
                if (x3[j] > x3[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted){
                break;
            }else{
                for (int j=0; j<n3-1-i; j++){
                    if (x3[j] > x3[j+1]){
                        int temp = x3[j];
                        x3[j] = x3[j+1];
                        x3[j+1] = temp;
                    }
                }
            }
        }
        System.out.print("Sorted Array: ");
        print(x3);

        // 4rth - Bubble sort (basic++)
        System.out.println(" ");
        int[] x4 = {5,1,4,3,0,-1,1,2};
        int n4 = x4.length;
        System.out.print("Given Array: ");
        print(x4);
        for (int i=0; i<n4-1; i++){
            boolean isSorted = true;
            for (int j=0; j<n4-1-i; j++) {
                if (x4[j] > x4[j + 1]) {
                    int temp = x4[j];
                    x4[j] = x4[j + 1];
                    x4[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
        System.out.print("Sorted Array: ");
        print(x4);

        // 5th - HW - Bubble sort in descending order
        System.out.println(" ");
        int[] x5 = {5,3,1,4,9,0,3,2,-1,7};
        System.out.print("Given Array: ");
        print(x5);
        int n5 = x5.length;
        for (int i=0; i<n5-1; i++){
            int swap = 0;
            for (int j=0; j<n5-1-i; j++) {
                if (x5[j] < x5[j + 1]) {
                    int temp = x5[j];
                    x5[j] = x5[j + 1];
                    x5[j + 1] = temp;
                    swap = 1;
                }
            }
            if (swap == 0){
                break;
            }
        }

        System.out.print("Sorted Array in desc order: ");
        print(x5);
    }
}
