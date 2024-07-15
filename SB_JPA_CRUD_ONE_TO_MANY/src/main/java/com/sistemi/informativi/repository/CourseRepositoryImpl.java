package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository{


    //DOMANDA= jpa è una specifica API java classica o SPRING?
    //riposta = API JAVA
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addCourse(Course course) {
        em.persist(course);
    }

    @Override
    public void removeCourse(int id) {
        em.remove(em.find(Course.class, id));
    }
}
