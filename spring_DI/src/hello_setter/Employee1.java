package hello_setter;

import java.math.BigDecimal;

public class Employee1 {
    private String name;
    private int age;
    private BigDecimal salary;

    public Employee1(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
