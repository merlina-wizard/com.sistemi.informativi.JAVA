package com.sistemi.informativi.sql;

public interface SqlScript {

    public static String sqlStudentInsert = "insert into student (first_name, last_name, age) values (?, ?, ?)";
}
