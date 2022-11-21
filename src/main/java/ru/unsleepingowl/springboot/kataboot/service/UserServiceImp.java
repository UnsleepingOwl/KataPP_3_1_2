package ru.unsleepingowl.springboot.kataboot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.unsleepingowl.springboot.kataboot.dao.UserDao;
import ru.unsleepingowl.springboot.kataboot.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void update(User user, Long id) {
        userDao.update(user, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
