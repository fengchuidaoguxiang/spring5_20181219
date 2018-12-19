package xml_autowired;
//需求：让Spring帮我创建Person对象，而Person对象依赖Dog对象
public class Person {
    private Dog dog;

    public Person(Dog dog) {
        this.dog = dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String toString() {
        return "Person{dog=" + dog + '}';
    }
}
