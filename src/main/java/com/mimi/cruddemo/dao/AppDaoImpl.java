package com.mimi.cruddemo.dao;

import com.mimi.cruddemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDaoImpl  implements AppDao{
    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager
    public AppDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist((theInstructor));
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return  entityManager.find(Instructor.class, theId);

    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
        Instructor tempInstructor =entityManager.find(Instructor.class, theId);
        entityManager.remove(tempInstructor);
    }
}
