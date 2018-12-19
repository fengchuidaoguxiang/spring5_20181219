package hello.dao;

import hello.domain.Employee;

public interface IEmployDAO {

    public void save(Employee emp);
    public void update(Employee emp);
}
