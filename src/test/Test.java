package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.imp.IUserService;

public class Test {

    public static void main(String[] args) {
//        IUserService iUserService=new UserServiceImp();
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");

        IUserService iUserService=ioc.getBean(IUserService.class);
        System.out.println(iUserService.getUser().getName()+"====");
    }
}
