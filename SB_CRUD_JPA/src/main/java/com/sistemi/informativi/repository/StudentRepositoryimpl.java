package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional    //jakarta(solo transazioni locali) o Oracle (local e global)
/*
transazione= (concetto database relazionale) una transazione è una o un insieme di
operazioni che devono essere eseguite su un database relazionale atomicamente
(cioè che tutte le operazioni devono andare a buon fine)
tipo -locale/distribuita operazioni su un solo database
     -globale operazioni eseguite su più database

 */
@Repository
public class StudentRepositoryimpl implements StudentRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public void addStudent(Student student) {

        em.persist(student);

    }

    @Override
    public void updateStudent(Student student) {

        em.merge(student);
    }

    @Override
    public void deleteStudent(int id) {

        em.remove(em.find(Student.class, id));
    }

    @Override
    public List<Student> getStudent() {
        return (em.createNamedQuery("Student.getStudents", Student.class).getResultList());
    }

    @Override
    public List<Student> getStudentLastName(String lastName) {
       return (em.createNamedQuery("Student.getStudentLastName", Student.class).setParameter("lastName", lastName)
               .getResultList());
    }
}
