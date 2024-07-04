package com.sistemi.informativi.main;


import com.sistemi.informativi.DAO.StudentDAO;
import com.sistemi.informativi.DAO.StudentDAOimpl;
import com.sistemi.informativi.DTO.bean.StudentDTO;
import com.sistemi.informativi.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection con = ConnectionManager.getConnection();
        StudentDAO studentDAO = new StudentDAOimpl();

        StudentDTO studentToAdd = new StudentDTO("anna", "dai capelli rossi", 22);

        studentDAO.addStudent(studentToAdd);

        StudentDTO studentToUpdate = new StudentDTO("anna", "dai capelli rossi", 30);
        studentDAO.updateStudent(studentToUpdate, 9);

        studentDAO.removeStudent(6);

        studentDAO.getStudent().forEach(System.out::println);

        ConnectionManager.closeConnection();

    }
}