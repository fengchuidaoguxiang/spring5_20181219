package ioc.example.Domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
public class User2 {
    private long myId;
    private String  myName;
    private int age;

    public User2(long myId, String myName, int age) {
        this.myId = myId;
        this.myName = myName;
        this.age = age;
    }
}
