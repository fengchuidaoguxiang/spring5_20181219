package mypractice;

import org.springframework.beans.factory.FactoryBean;

public class DogFactory {
    public  Dog getDog(){
        System.out.println("dynamic new dog ....");
        return  new Dog();
    }
}
