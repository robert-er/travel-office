package com.traveloffice;

import java.util.HashSet;
import java.util.Set;

public class UserRepository {

    private Set<User> userSet = new HashSet<>();
    private int userCounter;

    public void addUser(User user) {
        userCounter++;
        user.setUserId(userCounter);
        userSet.add(user);
    }

    public Set getAll() {
        return userSet;
    }

    public User getUserById(int id) {
        for (User user : userSet) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

}
