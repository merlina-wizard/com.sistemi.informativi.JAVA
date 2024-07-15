package com.sistemi.informativi;

import com.sistemi.informativi.entity.Student;
import com.sistemi.informativi.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //rappresenta l'application context (cioè chi dovrà istanziare
public class SbCrudJpaApplication implements CommandLineRunner {

    @Autowired
    private StudentServiceImpl studentService;

    public static void main(String[] args) {
        SpringApplication.run(SbCrudJpaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        studentService.checkAddsStudent(new Student("Maria", "Verdi", 54));
        studentService.checkAddsStudent(new Student("Mario", "Rossi", 54));
        studentService.checkAddsStudent(new Student("Mariello", "Rossi", 4));
        studentService.checkUpdatesStudent(new Student("Mariello", "Rossi", 78));
        studentService.checkDeletesStudent(1);
        studentService.checkGetStudents();
        studentService.checkGetStudentsLastName("Rossi");

    }
}
