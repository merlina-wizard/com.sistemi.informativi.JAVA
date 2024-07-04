package com.sistemi.informativi.DAO;

import com.sistemi.informativi.DTO.bean.StudentDTO;
import com.sistemi.informativi.VO.StudentVO;
import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOimpl implements StudentDAO {

    @Override
    public void addStudent(StudentDTO studentDTO) throws SQLException, ClassNotFoundException {

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentInsert);
        ps.setString(1, studentDTO.getFirstName());
        ps.setString(2, studentDTO.getLastName());
        ps.setInt(3, studentDTO.getAge());

        ps.executeUpdate();

    }

    @Override
    public void updateStudent(StudentDTO studentDTO, int id) throws SQLException, ClassNotFoundException {

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentUpdate);
        ps.setString(1, studentDTO.getFirstName());
        ps.setString(2, studentDTO.getLastName());
        ps.setInt(3, studentDTO.getAge());
        ps.setInt(4, id);

        ps.executeUpdate();

    }

    @Override
    public void removeStudent(int id) throws SQLException, ClassNotFoundException {

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentDelete);
        ps.setInt(1, id);

        ps.executeUpdate();

    }

    @Override
    public ArrayList<StudentVO> getStudent() throws SQLException, ClassNotFoundException {

        ArrayList<StudentVO> students = new ArrayList<StudentVO>();

        StudentVO studentVO = null;

        ResultSet rs = ConnectionManager.getResultSet(SqlScript.sqlStudentRead);

        while (rs.next()) {
            studentVO = new StudentVO(rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("age"),
                    rs.getInt("id"));

            students.add(studentVO);

        }
        return students;
    }

}
