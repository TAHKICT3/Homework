package Polimorphizm;

public class Main {
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();
        Bird owl = new Owl();
        Bird[] b = {ostrich, owl, penguin};
        for (Bird t : b){
            t.Move();
        }
        Ostrich ostr = new Ostrich();
        Ostrich ostr2 = (Ostrich) ostr.CreateBird();
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
class Ostrich extends Bird{
    @Override void Move(){
        System.out.println("Ostrich run.");
    }
    Bird CreateBird(){
        return new Ostrich();
    }
}
