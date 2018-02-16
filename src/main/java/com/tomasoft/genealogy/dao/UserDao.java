package com.tomasoft.genealogy.dao;

import com.tomasoft.genealogy.entity.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Component
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public User findByEmail(String email){
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email=:email");
        query.setParameter("email", email);
        return (User)query.getSingleResult();
    }

    public void persist(User user){
        entityManager.persist(user);
    }

}
