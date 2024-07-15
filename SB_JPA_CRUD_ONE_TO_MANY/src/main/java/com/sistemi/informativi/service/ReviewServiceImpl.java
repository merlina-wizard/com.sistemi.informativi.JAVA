package com.sistemi.informativi.service;


import com.sistemi.informativi.entity.Review;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import org.slf4j.Logger;
import com.sistemi.informativi.repository.ReviewRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Value("${add.success.message}")
    private String addSuccessMessage;

    @Value("${add.error.message}")
    private String addErrorMessage;

    @Value("${delete.success.message}")
    private String deleteSuccessMessage;

    @Value("${delete.error.message}")
    private String deleteErrorMessage;

    @Value("${get.error.message}")
    private String  getErrorMessage;


    Logger log = LoggerFactory.getLogger(this.getClass());

    private ReviewRepository reviewRepository;
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;

    }

    @Override
    public void checkAddReview(Review review) {
        try {

            reviewRepository.addReview(review);
            log.info(addSuccessMessage);

        }

        catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

            log.info(addErrorMessage);
            ex.printStackTrace();

        }

    }

    @Override
    public void checkReviewsById(int id) {

        try{
            List<Review> reviews = reviewRepository.getReviewbyId(id);
            if(!reviews.isEmpty()){
                reviews.forEach(review->log.info(review.toString()));
            }
            else
                throw new NullPointerException();
        }
        catch (NullPointerException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
    }
}
