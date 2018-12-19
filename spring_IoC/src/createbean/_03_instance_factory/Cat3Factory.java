package createbean._03_instance_factory;

import createbean._02_static_factory.Cat2;

//Cat2的工厂
public class Cat3Factory {
    public Cat3 createInstance(){
        Cat3 c3 = new Cat3();
        return  c3;
    }
}
