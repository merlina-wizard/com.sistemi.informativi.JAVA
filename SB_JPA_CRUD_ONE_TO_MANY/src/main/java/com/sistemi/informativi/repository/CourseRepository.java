package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Course;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository {

    public void addCourse(Course course);

    public void removeCourse(int id);

}
