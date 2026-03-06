package constructor;

class Student1{
    String name;
    int[] marks;

    Student1(int[] arr){
        marks = arr;
    }

    Student1(int x){
        marks = new int[x];
    }
}

public class Constructor2 {
    public static void main(String[] args) {

        int[] arr = {7,8,4,8,9};
        Student1 s1 = new Student1(arr);
        s1.name = "Adarsh";
        s1.marks[0] = 56;
        System.out.println(s1.name);
        for (int ele: s1.marks){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        Student1 s2 = new Student1(2);
        s2.name = "Rony";
        s2.marks[0] = 100;
        s2.marks[1] = 45;
        System.out.println(s2.name);
        for (int ele: s2.marks){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
}
