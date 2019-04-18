package com.mkyong.dao;

import com.mkyong.entitys.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao {

    @Resource
    private SessionFactory sessionFactory;

    private UserEntity get(Integer id){
        return (UserEntity) sessionFactory.getCurrentSession().get(UserEntity.class,id);
    }
}
