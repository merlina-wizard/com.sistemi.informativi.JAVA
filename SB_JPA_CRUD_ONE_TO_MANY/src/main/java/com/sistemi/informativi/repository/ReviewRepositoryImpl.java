package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ReviewRepositoryImpl implements ReviewRepository{


    @PersistenceContext
    private EntityManager em;

    @Override
    public void addReview(Review review) {
       em.persist(review);
    }

    @Override
    public List<Review> getReviewbyId(int id) {
       Course course = em.find(Course.class, id);

        return course.getReviews();
    }
}
