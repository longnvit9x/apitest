package com.mkyong.servies;

import com.mkyong.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> getAllUsers() {
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User(1,
                "longnv",
                "node_1",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(2,
                "linhbv",
                "node_2",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(3,
                "hoangdm",
                "node_3",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(4,
                "anhpv",
                "node_4",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(5,
                "minhpt",
                "node_5",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(6,
                "sinhvd",
                "node_6",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(7,
                "hoanglm",
                "node_7",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(8,
                "oanhtq",
                "node_8",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(9,
                "phuongld",
                "node_9",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        list.add(new User(9,
                "trungnq",
                "node_9",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        ));
        return list;
    }

    public User findById(int id) {
        return new User(1,
                "longnv",
                "node_1",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        );
    }

    public User findByName(String name) {
        return new User(1,
                "longnv",
                "node_1",
                "https://avatars0.githubusercontent.com/u/1?v=4%22",
                "User",
                false
        );
    }

    public boolean addUser(User employee) {
        return false;
    }

    public boolean updateUser(int id, User employee) {
        return false;
    }

    public boolean deleteUser(int id) {
        return false;
    }
}
