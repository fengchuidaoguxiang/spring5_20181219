package context;

import dao.IEmployeeDao;
import domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
public class Application {
    @Autowired
    private IEmployeeDao dao;

    @Test
    public void testSave(){
        Employee employee = new Employee();
        employee.setId(9);
        employee.setName("小鱼儿");
        employee.setAge(22);
        dao.save(employee);
    }

    @Test
    public void testUpdate(){
        Employee employee = new Employee();
        employee.setId(7);
        employee.setName("虚竹");
        employee.setAge(32);
        dao.update(employee);
    }

    @Test
    public void testDelete(){
        dao.delete(2);
    }

    @Test
    public void testListAll(){
        List<Employee> employees = dao.listAll();
        for (Employee temp : employees) {
            System.out.println(temp);
        }
    }
    @Test
    public void testGet(){
        System.out.println(dao.get(1L));
    }

}
