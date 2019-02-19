package SuperExampl;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(3, "Тузик");
        d.Info();
    }
}
class Animal {
    private int age;
    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
class Dog extends Animal{
    String name;
    public Dog(int age, String name) {
        super(age);
        this.name = name;
    }
    void Info(){
        System.out.println("Age: " + super.getAge() + "; name: " + name + ".");
    }
}