package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface CourseService {

    public void checkAddCourse(Course course);
    public void checkRemoveCourse(int id);
}
