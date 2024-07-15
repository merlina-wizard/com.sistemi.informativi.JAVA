package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Student;
import com.sistemi.informativi.repository.StudentRepository;
import com.sistemi.informativi.repository.StudentRepositoryimpl;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void checkAddsStudent(Student student) {

        try {
          studentRepository.addStudent(student);
          log.info("Student added");
        }
        catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {
            log.info("Student already exists");
            ex.printStackTrace();
        }
    }

    @Override
    public void checkUpdatesStudent(Student student) {

        try {
             studentRepository.updateStudent(student);
             log.info("Student updated");
        }
        catch (IllegalArgumentException | TransactionRequiredException ex) {
            log.info("Student already exists");
            ex.printStackTrace();
        }

    }

    @Override
    public void checkDeletesStudent(int id) {

        try {
           studentRepository.deleteStudent(id);
           log.info("Student deleted");
        }
        catch ( EntityExistsException | TransactionRequiredException ex) {
            log.info("Student already exists");
            ex.printStackTrace();
        }

    }

    @Override
    public void checkGetStudents() {

        try {
         List<Student> students = new ArrayList<>();

         students = studentRepository.getStudent();
         if (!students.isEmpty()) {
             log.info("Students not found");
         }
         students.forEach(System.out::println);
        }
        catch (NullPointerException ex) {
            log.info("Student already exists");
            ex.printStackTrace();
        }

    }

    @Override
    public void checkGetStudentsLastName(String lastName) {

        try {

            List<Student> students = new ArrayList<>();
            students = studentRepository.getStudentLastName(lastName);
            if (!students.isEmpty()) {
                log.info("Students not found");
            }
            students.forEach(System.out::println);
        }
        catch (NullPointerException ex) {
            log.info("Student already exists");
            ex.printStackTrace();
        }

    }
}
