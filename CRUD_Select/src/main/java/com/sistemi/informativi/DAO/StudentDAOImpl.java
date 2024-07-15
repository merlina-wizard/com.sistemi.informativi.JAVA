package com.sistemi.informativi.DAO;


import com.sistemi.informativi.DTO.StudentDTO;
import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {


    @Override
    public int addStudent(StudentDTO studentDTO) throws SQLException, ClassNotFoundException {

        int id = 0;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentInsert);
        ps.setString(1, studentDTO.getFirstName());
        ps.setString(2, studentDTO.getLastName());
        ps.setString(3, studentDTO.getAge());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            id =  rs.getInt(1);
        }
        return id;
    }

}
