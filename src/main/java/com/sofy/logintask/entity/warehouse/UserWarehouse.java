package com.sofy.logintask.entity.warehouse;

import com.sofy.logintask.entity.User;

import java.util.*;

public class UserWarehouse {
    private final static UserWarehouse warehouse = new UserWarehouse();
    private Set<User> users = new HashSet<>();

    private UserWarehouse(){};

    public static UserWarehouse getWarehouse(){
        return warehouse;
    }

    public List<String> usersName(){
        List<String> names = new ArrayList<>();
        for (User user : users){
            names.add(user.getLogin());
        }

        return names;
    }

    public void add(User user){
        users.add(user);
    }

    public void add(String name, String password){
        User user = new User(name, password);
        users.add(user);
    }

    public Optional<User> find(String name, String password){
        Optional<User> user = Optional.empty();
        User searchingUser = new User(name, password);
        if (users.contains(searchingUser)){
            user = Optional.of(searchingUser);
        }

        return user;
    }
}
