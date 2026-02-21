import java.util.ArrayList;

public class Day35 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i+=2){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        // 1st - Get Alternates
        System.out.println(" ");
        int[] x1 = {1,2,3,4};
        System.out.print("Given Array: ");
        print(x1);
        System.out.println("Answer: "+getAlternates(x1));

        // very hactic and busy day
    }
}
