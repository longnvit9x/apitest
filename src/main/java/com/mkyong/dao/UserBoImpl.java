package com.mkyong.dao;

import com.mkyong.models.User;

public class UserBoImpl  implements UserBo {
    UserDao userDao;

    public void setUserDao(UserDao stockDao) {
        this.userDao = stockDao;
    }
    @Override
    public void save(User stock) {

    }

    @Override
    public void update(User stock) {

    }

    @Override
    public void delete(User stock) {

    }

    @Override
    public User findByUser(String stockCode) {
        return null;
    }
}
