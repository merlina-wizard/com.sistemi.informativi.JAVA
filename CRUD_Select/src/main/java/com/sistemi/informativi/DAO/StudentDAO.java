package com.sistemi.informativi.DAO;


import com.sistemi.informativi.DTO.StudentDTO;

import java.sql.SQLException;

public interface StudentDAO {

    public int addStudent(StudentDTO studentDTO) throws SQLException, ClassNotFoundException;
}
