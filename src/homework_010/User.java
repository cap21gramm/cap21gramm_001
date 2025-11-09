package homework_010;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String nickname;
    private String email;
    private String gender;
    private int age;

    public User(int id, String name, String nickname, String email, String gender, int age) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User id " + id + " info: \n\t" + name + "\n" + "\t" + nickname + "\n" + "\t" + email + "\n" + "\t"
                + gender + "\n" + "\t" + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickname, email, gender, age);
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(gender, user.gender);
    }
}

