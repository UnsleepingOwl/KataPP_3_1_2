package ru.unsleepingowl.springboot.kataboot.dao;


import ru.unsleepingowl.springboot.kataboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(Long id);
    void update(User user, Long id);
    List<User> listUsers();
    User getUserById(Long id);
}
