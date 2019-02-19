package ToStringExample;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer("Kiev-9", "Windows XP");
        System.out.println(c.toString());
    }
}
class Computer{
    String name, OS;
    public Computer(String name, String OS) {
        this.name = name;
        this.OS = OS;
    }

    @Override
    public String toString() {
         return "Computer{" +
                "name='" + name + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}