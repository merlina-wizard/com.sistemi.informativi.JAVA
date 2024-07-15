package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Student;


public interface StudentService {

    public void checkAddsStudent(Student student);

    public void checkUpdatesStudent(Student student);

    public void checkDeletesStudent(int id);

    public void checkGetStudents();

    public void checkGetStudentsLastName(String lastName);
}
