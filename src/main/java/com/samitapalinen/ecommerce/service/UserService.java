package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samitapalinen.ecommerce.model.User;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public String addUser(User quote) {
        try {
            users.add(quote);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "User added";
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public String updateUser(int id, User updatedUser)
    {
        int userListSize = users.size();
        for (int i = 0; i < userListSize; i++) {
            if (users.get(i).getId() == id) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return "User updated";
            }
        }
        return "No user found";
    }

    public String deleteUser(int id) {
        int userListSize = users.size();
        for (int i = 0; i < userListSize; i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
                return "User deleted";
            }
        }
        return "No user found";
    }
}
