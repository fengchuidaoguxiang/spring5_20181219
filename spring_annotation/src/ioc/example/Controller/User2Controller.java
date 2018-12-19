package ioc.example.Controller;

import ioc.example.Domain.User2;
import ioc.example.Service.IUser2Service;
import lombok.Setter;

public class User2Controller {
    @Setter
    private IUser2Service service;
    public void execute(){
           System.out.println("控制层成功");
           service.insertService(new User2(13,"DaMing2",22));
    }
}
