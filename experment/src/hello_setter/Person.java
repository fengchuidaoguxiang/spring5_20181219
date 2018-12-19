package hello_setter;

public class Person {
    private Dog dog;

    public Person() {
    }

    public Person(Dog dog2){
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "dog=" + dog + '}';
    }
}
