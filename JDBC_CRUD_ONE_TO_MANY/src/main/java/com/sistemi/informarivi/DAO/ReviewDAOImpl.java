package com.sistemi.informarivi.DAO;

import com.sistemi.informarivi.DTO.ReviewDTO;
import com.sistemi.informarivi.VO.ReviewVO;
import com.sistemi.informarivi.connection.ConnectionManager;
import com.sistemi.informarivi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDAOImpl implements ReviewDAO {


    @Override
    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewInsert);
        ps.setString(1, reviewDTO.getLocation());
        ps.setInt(2, reviewDTO.getCourseId());
        ps.executeUpdate();
    }

    @Override
    public void deleteReview(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewDelete);
        ps.setInt(1, id);
        ps.executeUpdate();

    }

    @Override
    public ArrayList<ReviewVO> getReviewsLocation(int idCourse) throws SQLException, ClassNotFoundException {

        ArrayList<ReviewVO> reviews = new ArrayList<>();
        ReviewVO reviewVO = null;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewsLocationbyCourse);

        ps.setInt(1, idCourse);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            reviewVO = new ReviewVO(rs.getString("location"));
            reviews.add(reviewVO);
        }

        return reviews;

    }
}
