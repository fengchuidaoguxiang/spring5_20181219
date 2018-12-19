package dependancy_inject_xml_autowired;
//需求：让Spring帮我创建Person对象，而Person对象依赖Dog对象
public class Person {
    //Person对象的依赖
    private Dog dog;

    //构造器注入依赖
    public Person(Dog dog) {
        this.dog = dog;
    }

    //setter方法注入依赖
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    @Override
    public String toString() {
        return "Person{" + "dog=" + dog + '}';
    }
}
