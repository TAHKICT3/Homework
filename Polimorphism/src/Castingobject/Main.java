package Castingobject;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Lizard l = new Lizard();
        Cat c = new Cat();
        a1 = l;
        a2 = c;
        boolean b = a1 instanceof Cat;
        if(b){
            Cat c1 = (Cat) a1;
        }
        else{
            System.out.println("You have same problems.");
        }
        b = a2 instanceof Cat;
        if(b){
            Cat c2 = (Cat) a2;
        }
        else{
            System.out.println("You have same problems.");
        }
    }
}
class Animal {
    int weight = 10;
}
class Lizard extends Animal{
    String color = "green";
}
class Cat extends Animal{
    String name = "Matroskin";
}