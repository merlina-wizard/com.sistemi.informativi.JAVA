package com.sistemi.informarivi.main;

import java.sql.*;

public class Main {

    private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/openjob";
    //                                              //dove.è.il.database/nome.database
    private static final String dbUser = "root";
    private static final String dbPassword = "";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String sqlStudentInsert = "insert into student(first_name, last_name, age) values(?,?,?)";
        String sqlStudentUpdate = "update student set first_name=?, last_name=?, age=? where id=?";
        String sqlStudentDelete = "delete from student where id=?";
        String sqlStudentRead = "select * from student";


        //CRUD
        //step 1) indicazione driver di connessione;
        Class.forName(dbDriver);

        //step2 apertura connessione al database
        Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

        //step3 operazioni di CRUD
        //3.1 inserimento nella tabella student nel database openjob

        //accetta in input uno sript anonimo(place holder) "?" che ppoi dovranno essere concretizzati
        PreparedStatement psInsert = connection.prepareStatement(sqlStudentInsert, PreparedStatement.RETURN_GENERATED_KEYS);

        psInsert.setString(1, "Martina");
        psInsert.setString(2, "Merlini");
        psInsert.setInt(3, 22);

        //1) prepare statement (sql anonimo) 2) set 3) executeUpdate
       // psInsert.executeUpdate();

        //3.2 update di un record
        PreparedStatement psUpdate = connection.prepareStatement(sqlStudentUpdate);

       psUpdate.setString(1, "Flavio");
       psUpdate.setString(2, "Biondo");
       psUpdate.setInt(3, 24);
       psUpdate.setInt(4, 2);

        //psUpdate.executeUpdate();

        //3.3 Delete
        PreparedStatement pdDelete = connection.prepareStatement(sqlStudentDelete);

        pdDelete.setInt(1,  7);

       // pdDelete.executeUpdate();

        //lettura integrale
        Statement stmt = connection.createStatement();

        //passagli la Query --> la lettura non ha bisogno di Update
        ResultSet rs = stmt.executeQuery(sqlStudentRead);
        //struttura dati JDBC, struttura dinamica che si autocompone a RUNTIME grazie alla lettura

        while (rs.next()) {
            System.out.println(rs.getInt("id") + rs.getString("first_name") + rs.getString("last_name") + rs.getInt("age"));
        }

        connection.close();
    }
}