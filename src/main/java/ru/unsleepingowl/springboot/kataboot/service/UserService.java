package ru.unsleepingowl.springboot.kataboot.service;



import ru.unsleepingowl.springboot.kataboot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(Long id);
    void update(User user, Long id);
    List<User> listUsers();
    User getUserById(Long id);
}
