import java.util.ArrayList;
import java.util.Collections;

public class Day25 {
    public static void main(String[] args) {

        // 1st - ArrayList Intro
        System.out.println(" ");
        ArrayList<Integer> x1 = new ArrayList<>();
        x1.add(18);
        x1.add(45);
        x1.add(36);
        x1.add(7);
        x1.add(100);

        System.out.println(x1.get(1)); // x1[1]
        x1.set(3,20); // x1[3] = 20

        System.out.println(x1);
        int n1 = x1.size(); // x1.length
        for(int ele:x1){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        x1.add(120); // at end 18 45 36 20 100 120
        System.out.println(x1);
        x1.add(1,30); // at index 1 add 30 : 18 30 45 36 20 100 120
        System.out.println(x1);

        x1.remove(2); // remove element of index
        x1.remove(x1.size()-1); // remove last element
        System.out.println(x1);

        Collections.reverse(x1); // reverse the x1
        System.out.println(x1);

        int i = 0, j = x1.size()-1;
        while (i<j){
            int temp = x1.get(i);
            x1.set(i,x1.get(j));
            x1.set(j,temp);
            i++;
            j--;
        }
        System.out.println(x1);

        // 2nd - Adding One
        System.out.println(" ");
        int[] x2 = {5,6,7,8};
        System.out.print("Given Array: ");
        for (int ele:x2){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        ArrayList<Integer> ans = new ArrayList<>();
        int n2 = x2.length;
        int carry = 1;
        for(int i1=n2-1; i1>=0; i1--){
            if(x2[i1]+carry <= 9){
                ans.add(x2[i1]+carry);
                carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }

        Collections.reverse(ans);
        if(ans.get(0) == 0){
            ans.add(0,1);
            System.out.println(ans);
        }
        System.out.println("Answer: "+ans);
    }
}
