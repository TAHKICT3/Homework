package HashCode;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        int c = o.hashCode();
        System.out.println(c);
        Human h = new Human();
        int g = h.hashCode();
        System.out.println(g);
        h.age = 29;
        h.name = "Stanislav";
        h.Say();
        g = h.hashCode();
        System.out.println(g);
    }
}
class Human{
    int age;
    String name;
    void Say(){
        System.out.println("Hello!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}