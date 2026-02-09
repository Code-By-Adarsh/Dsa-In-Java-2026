public class Day23 {
    public static void print(int[] arr){
        System.out.print("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {

        // 1st - Missing Number
        System.out.println(" ");
        int[] x1 = {6,8,5,3,4,1,2}; // size n-1 and element 1 to n
        print(x1);
        int n = x1.length+1;
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for(int ele:x1){
            arrSum += ele;
        }
        System.out.println("Missing Element: "+(sum-arrSum));

        // 2nd - Segregates 0s and 1s
        System.out.println(" ");
        int[] x2 = {0,1,1,0,0,1};
        print(x2);
        int noOf0 = 0;
        for(int ele:x2){
            if(ele == 0){
                noOf0++;
            }
        }

        for(int i=0; i<x2.length; i++){
            if(i < noOf0){
                x2[i] = 0;
            }else{
                x2[i] = 1;
            }
        }
        print(x2);
    }
}
