package com.sistemi.informarivi.main;

import com.sistemi.informarivi.DAO.CourseDAO;
import com.sistemi.informarivi.DAO.CourseDAOImpl;
import com.sistemi.informarivi.DAO.ReviewDAO;
import com.sistemi.informarivi.DAO.ReviewDAOImpl;
import com.sistemi.informarivi.DTO.CourseDTO;
import com.sistemi.informarivi.DTO.ReviewDTO;
import com.sistemi.informarivi.connection.ConnectionManager;
import com.sistemi.informarivi.facade.FacadeDAO;
import com.sistemi.informarivi.facade.FacadeDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        /*
        int id;

        Connection con = ConnectionManager.getConnection();
        CourseDAO courseDAO = new CourseDAOImpl();
        id = courseDAO.addCourse(new CourseDTO("React"));
        ReviewDAO reviewDAO = new ReviewDAOImpl();
        reviewDAO.addReview(new ReviewDTO("Florence", id));
         */

        FacadeDAO facadeDAO = new FacadeDAOImpl();


        Connection con = facadeDAO.getConnection();
        /*
        int id = facadeDAO.addCourse(new CourseDTO("React"));
        facadeDAO.addReview(new ReviewDTO("Florence", id));
        facadeDAO.addReview(new ReviewDTO("Tinbuktu", id));
        facadeDAO.addReview(new ReviewDTO("Honululu", id));

        facadeDAO.getReviewsLocation(id).forEach(System.out::println);

        id = facadeDAO.addCourse(new CourseDTO("Corso3"));
        facadeDAO.addReview(new ReviewDTO("Malaga", id));
        facadeDAO.addReview(new ReviewDTO("Parigi", id));
        facadeDAO.getReviewsLocation(id).forEach(System.out::println);
         */

        facadeDAO.closeConnection();

    }
}