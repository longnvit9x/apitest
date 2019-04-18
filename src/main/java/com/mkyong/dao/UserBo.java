package com.mkyong.dao;

import com.mkyong.models.User;

public interface UserBo {
    void save(User stock);
    void update(User stock);
    void delete(User stock);
    User findByUser(String stockCode);
}
