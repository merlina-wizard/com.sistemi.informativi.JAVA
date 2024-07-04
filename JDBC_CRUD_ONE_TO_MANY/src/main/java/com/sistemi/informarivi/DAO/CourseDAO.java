package com.sistemi.informarivi.DAO;

import com.sistemi.informarivi.DTO.CourseDTO;

import java.sql.SQLException;

public interface CourseDAO {

    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException;

    public void deleteCourse(int id) throws SQLException, ClassNotFoundException;

}
