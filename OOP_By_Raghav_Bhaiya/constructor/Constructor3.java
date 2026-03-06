package constructor;

class Player{
    String name;
    String type;
}

public class Constructor3 {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.name = "Virat";
        p1.type = "Batsman";
        Player p2 = p1; // Shallow copy
        p2.name = "Jassi";
        p2.type = "Bowler";
        System.out.println(p1.name);
        System.out.println(p1.type);
    }
}

/*
-----------Notes--------------
1.Shallow Copy
 */