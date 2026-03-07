public class RDay02 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 1st - Reverse an Array (Without Using Another Array)
        System.out.println(" ");
        int[] x1 = {1, 2, 3, 4, 5};
        System.out.print("Given Array: ");
        print(x1);

        int i = 0, j = x1.length-1;
        while (i<j){
            int temp = x1[i];
            x1[i] = x1[j];
            x1[j] = temp;
            i++;
            j--;
        }

        System.out.print("Answer: ");
        print(x1);

        // 2nd - Count Even and Odd Numbers
        System.out.println(" ");
        int[] x2 = {4,7,2,9,6,3};
        System.out.print("Given Array: ");
        print(x2);

        int even = 0, odd = 0;
        for (int ele:x2){
            if (ele % 2==0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("Even = "+even);
        System.out.println("Odd = "+odd);
    }
}
