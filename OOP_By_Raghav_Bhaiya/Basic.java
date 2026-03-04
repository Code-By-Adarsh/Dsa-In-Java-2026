public class Basic {

    public static class Student{
        String name;
        int rollNo;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jignesh";
        s1.rollNo = 51;
        s1.cgpa = 8.6;

        Student s2 = new Student();
        s2.name = "Adarsh";
        s2.rollNo = 52;
        s2.cgpa = 8.4;

        Student s3 = new Student();
        s3.name = "Pritam";
        s3.rollNo = 53;
        s3.cgpa = 8.5;

        System.out.println(s1.name+" "+s1.rollNo+" "+s1.cgpa);
        s2.rollNo = 54;
        System.out.println(s2.rollNo);
    }
}

/*
 -------------------Notes---------------------
 1.Class = A blueprint
 2.Object = A real world entity
 */
