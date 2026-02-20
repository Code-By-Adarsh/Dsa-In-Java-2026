import java.util.ArrayList;

public class Day34 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void pushZerosToEnd(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static int countFreq(int[] arr, int target) {
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                answer++;
            }
        }
        return answer;
    }

    public static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != x && arr[j] != x) {
                i++;
                j--;
            } else if (arr[i] == x && arr[j] != x) {
                j--;
            } else if (arr[i] != x && arr[j] == x) {
                i++;
            } else {
                list.add(i);
                list.add(j);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {

        // 1st - Move all zeros to end
        System.out.println(" ");
        int[] x1 = {1,2,0,4,0,0,5,0};
        System.out.print("Given Array: ");
        print(x1);
        pushZerosToEnd(x1);
        System.out.print("Answer: ");
        print(x1);

        // 2nd - Number of Occurrence
        System.out.println(" ");
        int[] x2 = {1,2,2,2,2,6};
        System.out.print("Given Array: ");
        print(x2);
        System.out.println("Answer: "+countFreq(x2,2));

        // 3rd - First and last occurrences
        System.out.println(" ");
        int[] x3 = {1,3,5,5,5,5,6,7,125};
        int x = 5;
        System.out.print("Given Array: ");
        print(x3);
        System.out.println("Answer: "+find(x3,x));
    }
}
