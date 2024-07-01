package com.sistemi.informativi.DAO;

import com.sistemi.informativi.bean.BackEndCourse;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MockBackEndCourseDAOimpl implements MockBackEndCourseDAO {
    @Override
    public Stream<Object> getBackEndCourse() {

        //MOCK
        ArrayList<String> language1 = new ArrayList<>();
        language1.add("Java");
        language1.add("JPQL");

        ArrayList<String> framework1 = new ArrayList<>();
        framework1.add("Spring MVC");
        framework1.add("Spring Restful");

        ArrayList<String> language2 = new ArrayList<>();
        language2.add("C#");
        language2.add("LinQ");

        ArrayList<String> framework2 = new ArrayList<>();
        framework2.add("WPF");
        framework2.add("WCF");

        BackEndCourse course1 = new BackEndCourse("Java Spring", "Roma",
                language1, framework1, "mySQL");

        BackEndCourse course2 = new BackEndCourse(".net", "Milan",
                language2, framework2, "sqlServer");

        return Stream.of(course1, course2);
    }
}
