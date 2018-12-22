package service;

import domain.Student;

public interface IStudentService {
    public void save(Student stu);
    public Student query(long id);
}
