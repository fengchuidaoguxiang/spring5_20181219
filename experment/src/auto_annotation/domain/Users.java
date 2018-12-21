package auto_annotation.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Users {
    private String username;
    private int age;
    private String sex;

    public Users(String username, int age, String sex) {
        this.username = username;
        this.age = age;
        this.sex = sex;
    }
}
