package hello_namespace;

public class Person1 {
    private Cat1 c1;

    public void setC1(Cat1 c1) {
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "Person1{" + "cat1=" + c1 + '}';
    }
}
