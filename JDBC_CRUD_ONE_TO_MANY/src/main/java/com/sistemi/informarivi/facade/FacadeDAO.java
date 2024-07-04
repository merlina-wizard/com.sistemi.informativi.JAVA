package com.sistemi.informarivi.facade;

import com.sistemi.informarivi.DTO.CourseDTO;
import com.sistemi.informarivi.DTO.ReviewDTO;
import com.sistemi.informarivi.VO.ReviewVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FacadeDAO {

    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException;

    public void deleteCourse(int id) throws SQLException, ClassNotFoundException;

    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException;

    public void deleteReview(int id) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewVO> getReviewsLocation(int idCourse) throws SQLException, ClassNotFoundException;

    public Connection getConnection() throws SQLException, ClassNotFoundException;

    public void closeConnection() throws SQLException, ClassNotFoundException;
}
