package dao.imp;

import dao.IUerDao;
import entity.User;

public class UserNewDaoImp implements IUerDao {
    @Override
    public User getUser() {
        return new User("heihei");
    }
}
