# SpringJarIoc
Spring FrameWork
提前定义好 一些方案
Spring 
IOC：控制反转 电脑和鼠标
Aop：面向切面编程


IOC：
1.基于jar 方式搭建+xml
下载dist 文件夹
总共四个jar
 beans core context  expression jcl(log jar)
配置xml

备注：spring.xml 需要在classpath下面
2.写xml 配置bean
<bean class="dao.imp.UserNewDaoImp" id="userDaoImp"/>
<bean class="service.imp.UserServiceImp" id="userServiceImp">
    <property name="dao" ref="userDaoImp"/>
</bean>
3. 需要注入的成员变量要实现get set 方式
private IUerDao dao;
public IUerDao getDao() {
    return dao;
}
public void setDao(IUerDao dao) {
    this.dao = dao;
}
4.如果使用 通过spring 来管理
ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
IUserService iUserService=ioc.getBean(IUserService.class);
System.out.println(iUserService.getUser().getName()+"====");

从而实现了控制反转

Di 是ioc 的具体的现实
IOC的优点：
1.解偶
2.集中管理
3.功能可复用（减少对象的创建和内存消耗）
4.使得程序的整个体系结构可维护性，灵活性，扩展性