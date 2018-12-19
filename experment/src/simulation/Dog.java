package simulation;

public class Dog {
    private String name;
    private int age;
    private  Dog(){}
    public void say(){
        System.out.println("say hello...,狗名字：" + name +",狗年龄："+ age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
