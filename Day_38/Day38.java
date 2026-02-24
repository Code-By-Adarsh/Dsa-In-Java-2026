public class Day38 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 1st - Move all zeros to end - Time complexity : O(n^2)
        System.out.println(" ");
        int[] x1 = {1,0,3,0,5,6,0,0,-2,9,0,4,7,0};
        System.out.print("Given Array: ");
        print(x1);
        int n1 = x1.length;
        for (int i=0; i<n1-1; i++){
            for (int j=0; j<n1-1-i; j++){
                if (x1[j]==0){
                    int temp = x1[j];
                    x1[j] = x1[j+1];
                    x1[j+1] = temp;
                }
            }
        }
        System.out.print("Answer: ");
        print(x1);

        // 2nd - Move all zeros to end - Time Complexity : O(n)
        System.out.println(" ");
        int[] x2 = {1,0,3,0,5,6,0,0,-2,9,0,4,7,0};
        System.out.print("Given Array: ");
        print(x2);
        int index = 0;

        for(int i=0; i<x2.length; i++){
            if(x2[i] != 0){
                x2[index] = x2[i];
                index++;
            }
        }

        while(index<x2.length){
            x2[index] = 0;
            index++;
        }
        System.out.print("Answer: ");
        print(x2);

        // 3rd - Move all zeros to end (Window sliding approach)
        // Time Complexity : O(n)
        System.out.println(" ");
        int[] x3 = {1,0,3,0,5,6,0,0,-2,9,0,4,7,0};
        System.out.print("Given Array: ");
        print(x3);
        int left = 0;
        int right = 0;
        while(right<x3.length){
            if (x3[right] != 0){
                int temp = x3[right];
                x3[right] = x3[left];
                x3[left] = temp;
                left++;
            }
            right++;
        }
        System.out.print("Answer: ");
        print(x3);

        // 4rth - Selection sort
        System.out.println(" ");
        int[] x4 = {5,3,7,0,9,2,6,1};
        System.out.print("Given Array: ");
        print(x4);
        for (int i=0; i<x4.length-1; i++){
            int min = x4[i];
            int mindex = i;
            for(int j=i; j<x4.length; j++){
                if (min > x4[j]){
                    min = x4[j];
                    mindex = j;
                }
            }
            int temp = x4[i];
            x4[i] = x4[mindex];
            x4[mindex] = temp;
        }
        System.out.print("Answer: ");
        print(x4);
    }
}
