package dao.imp;

import dao.IUerDao;
import entity.User;

public class UserDaoImp implements IUerDao {
    @Override
    public User getUser() {
        return new User("water");
    }
}
