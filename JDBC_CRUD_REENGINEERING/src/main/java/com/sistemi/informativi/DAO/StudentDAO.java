package com.sistemi.informativi.DAO;

import com.sistemi.informativi.DTO.bean.StudentDTO;
import com.sistemi.informativi.VO.StudentVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {

    public void addStudent(StudentDTO studentDTO) throws SQLException, ClassNotFoundException;

    public void updateStudent(StudentDTO studentDTO, int id) throws SQLException, ClassNotFoundException;

    public void removeStudent(int id) throws SQLException, ClassNotFoundException;

    public ArrayList<StudentVO> getStudent() throws SQLException, ClassNotFoundException;
}
