package com.tomasoft.genealogy.dao;

import com.tomasoft.genealogy.entity.Animal;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class AnimalDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Animal animal){
        entityManager.persist(animal);
    }

    public Animal findById(int id){
        Query query = entityManager.createQuery("SELECT a FROM Animal a WHERE a.id=:id");
        query.setParameter("id",id);
        return (Animal) query.getSingleResult();
    }

    public Animal findByName(String name){
        Query query = entityManager.createQuery("SELECT a FROM Animal a WHERE a.name=:name");
        query.setParameter("name", name);
        return (Animal)query.getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public List<Animal>  findAll(){
        return entityManager.createQuery("SELECT a From Animal a").getResultList();
    }
}
