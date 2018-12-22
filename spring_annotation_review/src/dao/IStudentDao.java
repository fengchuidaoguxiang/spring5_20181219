package dao;

import domain.Student;

public interface IStudentDao {
    public void save(Student student);
    public Student query(long id);
}
