class Students1{
    String name;
    private int rollNo;
    double cgpa;

    void setRollNo(int a){ // Setter
        rollNo = a;
    }

    int getRollNo(){ // Getter
        return rollNo;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {

        Students1 s1 = new Students1();
        s1.name = "Adarsh";
        s1.cgpa = 9.2;
        // s1.rollNo = 52; --> Error
        s1.setRollNo(52); // by setter

        System.out.println("Name: "+s1.name);
        System.out.println("CGPA: "+s1.cgpa);
        // System.out.println("RollNo: "+s1.rollNo); --> Error
        System.out.println("RollNo: "+s1.getRollNo()); // by getter
    }
}

/*
-----------------------Notes--------------------
1.Getter and setter are used for private.
 */