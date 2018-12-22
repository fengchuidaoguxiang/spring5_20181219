package controller;

import domain.Student;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import service.IStudentService;

@org.springframework.stereotype.Controller("controller1")
public class Controller {
    @Autowired(required = false)
    @Qualifier("service1")
    @Setter
    IStudentService service;

    public void execute(){
        Student  student= service.query(2);
        System.out.println(student.getId() +":"+student.getName()+":"+student.getAge());
    }

    public void execute2(){
        service.save(new Student(15L,"WangMaZi",23));
    }
}
