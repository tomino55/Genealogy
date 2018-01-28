package com.tomasoft.genealogy.dao;

import com.tomasoft.genealogy.entity.Animal;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class AnimalDAO {

    @PersistenceContext
    EntityManager entityManager;

    public void persist(Animal animal){
        entityManager.persist(animal);
    }


    @SuppressWarnings("unchecked")
    public List<Animal>  findAll(){
        return entityManager.createQuery("SELECT a From Animal a").getResultList();
    }
}
