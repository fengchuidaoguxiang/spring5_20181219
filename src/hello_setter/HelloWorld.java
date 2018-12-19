package hello_setter;

public class HelloWorld {
    private String username;
    private int age;

    public HelloWorld() {

    }

    private HelloWorld(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("欢迎来到Spring帝国，你好：" + username+",年龄：" + age);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
