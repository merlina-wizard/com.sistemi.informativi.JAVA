package com.sistemi.informarivi.DAO;

import com.sistemi.informarivi.DTO.ReviewDTO;
import com.sistemi.informarivi.VO.CourseVO;
import com.sistemi.informarivi.VO.ReviewVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReviewDAO {

    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException;

    public void deleteReview(int id) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewVO> getReviewsLocation(int idCourse) throws SQLException, ClassNotFoundException;

}
