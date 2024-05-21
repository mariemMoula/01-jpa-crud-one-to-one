package com.mimi.cruddemo.dao;


import com.mimi.cruddemo.entity.Instructor;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
}
