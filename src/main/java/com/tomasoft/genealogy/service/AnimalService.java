package com.tomasoft.genealogy.service;

import com.tomasoft.genealogy.dao.AnimalDAO;
import com.tomasoft.genealogy.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalDAO animalDAO;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Animal> findAll(){
        return animalDAO.findAll();
    }

}
