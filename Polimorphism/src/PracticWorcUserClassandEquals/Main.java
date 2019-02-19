package PracticWorcUserClassandEquals;

import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sasha", "TAHKICT_3", new Date(2003, 6, 18));
        User user2 = new User("Qqt", "asuasgu", new Date(2018, 9, 28));
        System.out.println(user1.equals(user2));
    }
}
class User{
    String name, nickname;
    Date c;

    public User(String name, String nickname, Date c) {
        this.name = name;
        this.nickname = nickname;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.c, user.c);
    }
}