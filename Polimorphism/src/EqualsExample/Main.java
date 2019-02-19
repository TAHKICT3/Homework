package EqualsExample;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Sasha");
        String s2 = new String("Skrraja");
        String s3 = new String("Sasha");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println("█░█░█░█░█░█░█░█░█░█░█░█░█░█░");
        Cat c1 = new Cat("Мурзик", "персидский", 3);
        Cat c2 = new Cat("Барсик", "камышовый", 4);
        Cat c3 = new Cat("Мурзик", "персидский", 3);
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
class Cat{
    String name, breed;
    int age;
    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(breed, cat.breed);
    }
}
