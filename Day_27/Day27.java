import java.util.ArrayList;
import java.util.Collections;

public class Day27 {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // 0th - Practice - Adding one {5,6,7,8} + 1 = {5,6,7,9}
        System.out.println(" ");
        int[] x0 = {5,6,7,8};
        System.out.print("Array: ");
        print(x0);
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for (int i=x0.length-1; i>=0; i--){
            if (x0[i]+carry <= 9){
                ans.add(x0[i]+carry);
                carry = 0;
            }else {
                ans.add(0);
                carry = 1;
            }
        }

        Collections.reverse(ans);

        if (carry == 1){
            ans.add(0,1);
        }

        System.out.print("Answer: ");
        System.out.println(ans);


        // 1st - HW - {3,5,2,8,7} + {9,2,1} = {3,6,2,0,8}  <- Day 26
        System.out.println(" ");
        int[] x1 = {3,5,2,8,7};
        System.out.print("Array 1: ");
        print(x1);
        int[] y1 = {9,2,1};
        System.out.print("Array 2: ");
        print(y1);

        ArrayList<Integer> ans1 = new ArrayList<>();

        int i=x1.length-1 , j=y1.length-1, carry1 = 0;
        while (i>=0 && j>=0){
            if (x1[i]+y1[j]+carry1 <= 9){
                ans1.add(x1[i]+y1[j]+carry1);
                carry1 = 0;
            }else {
                ans1.add((x1[i]+y1[j]+carry1)%10);
                carry1 = 1;
            }
            i--;
            j--;
        }

        if (i == -1) {
            for (int j1 = j; j1 >= 0; j1--) {
                if (y1[j1] + carry1 <= 9) {
                    ans1.add(y1[j1] + carry1);
                    carry1 = 0;
                } else {
                    ans1.add(0);
                    carry1 = 1;
                }
            }
        }else {
            for (int i1=i; i1>=0; i1--){
                if (x1[i1]+carry1<=9){
                    ans1.add(x1[i1]+carry1);
                    carry1 = 0;
                }else {
                    ans1.add(0);
                    carry1 = 1;
                }
            }
        }

        Collections.reverse(ans1);
        if (carry1 == 1){
            ans1.add(0,1);
        }
        System.out.print("Answer: ");
        System.out.println(ans1);
    }
}
