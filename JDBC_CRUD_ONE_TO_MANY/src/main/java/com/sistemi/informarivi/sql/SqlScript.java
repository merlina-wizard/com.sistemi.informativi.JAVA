package com.sistemi.informarivi.sql;

public interface SqlScript {

    public static String sqlCourseInsert = "insert into course (title) values (?)";
    public static String sqlReviewsLocationbyCourse = "select location from review,course where review.course_id=course.id and course.id = ?";
    public static String sqlCourseDelete = "delete from course where id = ?";
    public static String sqlStudentRead = "select * from student";

    public static String sqlReviewInsert = "insert into review (location, course_id) values (?, ?)";
    public static String sqlReviewDelete = "delete from review where id = ?";

}
