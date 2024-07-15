package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Review;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository {

    public void addReview(Review review);

    public List<Review> getReviewbyId(int id);
}
