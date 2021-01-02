package service.imp;

import dao.IUerDao;
import dao.imp.UserDaoImp;
import entity.User;

public class UserServiceImp implements IUserService {
    private IUerDao dao;
    public IUerDao getDao() {
        return dao;
    }
    public void setDao(IUerDao dao) {
        this.dao = dao;
    }
//    private IUerDao dao=new UserDaoImp();



    @Override
    public User getUser() {
        return dao.getUser();
    }
}
