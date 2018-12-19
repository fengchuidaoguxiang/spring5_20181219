package register.action;

import lombok.Setter;
import register.domain.User;
import register.service.IUserService;

//模拟SpringMVC的controller
public class UserController {
    @Setter
    private IUserService service;
    public String execute(){
        System.out.println("注册请求");
        service.register(new User());
        return "Good luck,success";
    }
}
