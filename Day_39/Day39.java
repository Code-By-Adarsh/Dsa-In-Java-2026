public class Day39 {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 1st - Selection sorting descending order
        System.out.println(" ");
        int[] x1 = {2,0,5,8,2,1,6,4};
        System.out.print("Given Array: ");
        print(x1);

        for(int i=0; i<x1.length; i++){
            int maxdex = i;
            for (int j=i+1; j<x1.length; j++){
                if (x1[maxdex] < x1[j]){
                    maxdex = j;
                }
            }
            int temp = x1[i];
            x1[i] = x1[maxdex];
            x1[maxdex] = temp;
        }

        System.out.print("Answer: ");
        print(x1);
    }
}
