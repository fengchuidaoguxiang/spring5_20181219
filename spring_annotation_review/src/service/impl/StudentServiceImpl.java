package service.impl;

import dao.IStudentDao;
import domain.Student;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.IStudentService;

@Service("service1")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    @Qualifier("dao1")
    @Setter
    private IStudentDao dao;

    @Override
    public void save(Student stu) {
        System.out.println("业务层。。。");
        dao.save(stu);
    }

    @Override
    public Student query(long id) {
        System.out.println("业务层。。。");
        Student stu = dao.query(id);
        return stu;
    }
}
