package com.sistemi.informativi.DAO;

import com.sistemi.informativi.bean.FrontEndCourse;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MockFrontEndDAOimpl implements MockFrontEndCourseDAO{

    @Override
    public Stream<Object> getFrontEndCourses() {

        //MOCK
        ArrayList<String> language1 = new ArrayList<>();
        language1.add("Javascript");
        language1.add("Typescript");

        ArrayList<String> framework1 = new ArrayList<>();
        framework1.add("RxJS");
        framework1.add("Axios");

        ArrayList<String> language2 = new ArrayList<>();
        language2.add("Dart");
        language2.add("Go");

        ArrayList<String> framework2 = new ArrayList<>();
        framework2.add("Gin");
        framework2.add("Flutter");

        FrontEndCourse course1 = new FrontEndCourse("React JS", "Florence",
                language1, framework1, "Bootstrap");

        FrontEndCourse course2 = new FrontEndCourse("Flutter & GoLang", "Napoli",
                language2, framework2, "css");

        return Stream.of(course1, course2);
    }
}
