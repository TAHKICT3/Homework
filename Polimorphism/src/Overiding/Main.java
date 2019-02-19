package Overiding;

public class Main {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        p.Move();
        Owl o = new Owl();
        o.Move();
    }
}
class Bird{
    void Move(){
        System.out.println("Birds change there coordinates.");
    }
}
class Owl extends Bird{
    @Override void Move(){
        System.out.println("Owl flies.");
    }
}
class Penguin extends Bird{
    @Override void Move(){
        System.out.println("Penguin swims.");
    }
}