package com.sistemi.informarivi.DAO;

import com.sistemi.informarivi.DTO.CourseDTO;
import com.sistemi.informarivi.connection.ConnectionManager;
import com.sistemi.informarivi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAOImpl implements CourseDAO {


    @Override
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException {

        int id = 0;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCourseInsert);
        ps.setString(1, courseDTO.getTitle());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            id =  rs.getInt(1);
        }
        return id;
    }

    @Override
    public void deleteCourse(int id) throws SQLException, ClassNotFoundException {

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCourseDelete);
        ps.setInt(1, id);
        ps.executeUpdate();

    }
}
