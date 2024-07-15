package com.sistemi.informativi.servlet;


import com.sistemi.informativi.DAO.StudentDAO;
import com.sistemi.informativi.DAO.StudentDAOImpl;
import com.sistemi.informativi.DTO.StudentDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registration")
public class StudentRegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String age = request.getParameter("age");

        StudentDTO studentDTO = new StudentDTO(firstname, lastname, age);
        StudentDAO studentDAO = new StudentDAOImpl();
        try {
            studentDAO.addStudent(studentDTO);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
