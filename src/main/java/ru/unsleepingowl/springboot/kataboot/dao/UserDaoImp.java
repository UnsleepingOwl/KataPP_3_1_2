package ru.unsleepingowl.springboot.kataboot.dao;


import org.springframework.stereotype.Repository;
import ru.unsleepingowl.springboot.kataboot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void updateUser(User user, Long id) {
        User oldUser = getUserById(id);
        oldUser.setName(user.getName());
        oldUser.setLastName(user.getLastName());
        oldUser.setAge(user.getAge());
        entityManager.merge(oldUser);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsersList() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }
}
