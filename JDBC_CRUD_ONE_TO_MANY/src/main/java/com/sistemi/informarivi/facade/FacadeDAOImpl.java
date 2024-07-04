package com.sistemi.informarivi.facade;

import com.sistemi.informarivi.DAO.CourseDAO;
import com.sistemi.informarivi.DAO.CourseDAOImpl;
import com.sistemi.informarivi.DAO.ReviewDAO;
import com.sistemi.informarivi.DAO.ReviewDAOImpl;
import com.sistemi.informarivi.DTO.CourseDTO;
import com.sistemi.informarivi.DTO.ReviewDTO;
import com.sistemi.informarivi.VO.ReviewVO;
import com.sistemi.informarivi.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FacadeDAOImpl implements FacadeDAO {

    CourseDAO courseDAO = new CourseDAOImpl();
    ReviewDAO reviewDAO = new ReviewDAOImpl();

    @Override
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException {
        return courseDAO.addCourse(courseDTO);
    }

    @Override
    public void deleteCourse(int id) throws SQLException, ClassNotFoundException {

        courseDAO.deleteCourse(id);
    }

    @Override
    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException {

        reviewDAO.addReview(reviewDTO);
    }

    @Override
    public void deleteReview(int id) throws SQLException, ClassNotFoundException {

        reviewDAO.deleteReview(id);
    }

    @Override
    public ArrayList<ReviewVO> getReviewsLocation(int idCourse) throws SQLException, ClassNotFoundException {
        return reviewDAO.getReviewsLocation(idCourse);
    }

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        return ConnectionManager.getConnection();
    }

    @Override
    public void closeConnection() throws SQLException, ClassNotFoundException {
        ConnectionManager.closeConnection();
    }
}
