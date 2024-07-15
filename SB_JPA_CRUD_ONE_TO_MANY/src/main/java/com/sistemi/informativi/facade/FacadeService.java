package com.sistemi.informativi.facade;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;


public interface FacadeService {

    public void addCourse(Course course);

    public void addReview(Review review);

    public void deleteCourse(int id);

    public void getReviewbyCourse(int id);
}
