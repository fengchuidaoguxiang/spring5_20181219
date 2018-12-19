package hello_namespace;

import java.math.BigDecimal;

public class Employee1 {
    private String name1;
    private int age1;
    private BigDecimal salary1;

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public void setSalary1(BigDecimal salary1) {
        this.salary1 = salary1;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name1='" + name1 + '\'' +
                ", age1=" + age1 +
                ", salary1=" + salary1 +
                '}';
    }
}
