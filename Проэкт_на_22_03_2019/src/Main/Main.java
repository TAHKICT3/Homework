package Main;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        Developer d2 = new Developer();
        Developer d3 = new Developer();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Person p1 = new Person();
        Person p2 = new Person();
        Developer[] d = {d1, d2, d3, p1.CD()};
        Student[] s = {s1, s2, s3, p2};
        for (Developer r : d){
            r.whatAreYouDoing();
        }
        for (Student r : s){
            r.whatAreYouDoing();
        }
    }
}
class Developer{
    void whatAreYouDoing(){
        System.out.println("I'm hard coding...");
    }
}
class Student{
    void whatAreYouDoing(){
        System.out.println("I'm hard learning...");
    }
}
class Person extends Student{
    @Override
    void whatAreYouDoing(){
        System.out.println("I'm hard resting...");
    }
    public Developer CD(){
        return new Developer(){@Override
        void whatAreYouDoing(){
            Person.this.whatAreYouDoing();
        }};
    }
}