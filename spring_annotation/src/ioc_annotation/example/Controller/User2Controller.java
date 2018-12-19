package ioc_annotation.example.Controller;

import ioc_annotation.example.Domain.User2;
import ioc_annotation.example.Service.IUser2Service;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class User2Controller {
    @Autowired
    private IUser2Service service;
    public void execute(){
           System.out.println("控制层成功");
           service.insertService(new User2(15,"DaMing2",22));
    }
}
