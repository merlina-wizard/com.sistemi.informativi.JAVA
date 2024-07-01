package com.sistemi.informativi.facade;

import com.sistemi.informativi.DAO.MockBackEndCourseDAO;
import com.sistemi.informativi.DAO.MockBackEndCourseDAOimpl;
import com.sistemi.informativi.DAO.MockFrontEndCourseDAO;
import com.sistemi.informativi.DAO.MockFrontEndDAOimpl;

import java.util.stream.Stream;

public class FacadeDAOimpl implements FacadeDAO {

    MockFrontEndCourseDAO feDAO = new MockFrontEndDAOimpl();
    MockBackEndCourseDAO beDAO = new MockBackEndCourseDAOimpl();

    @Override
    public Stream<Object> getBackEndCourses() {
        return beDAO.getBackEndCourse();
    }

    @Override
    public Stream<Object> getFrontEndCourses() {
        return feDAO.getFrontEndCourses();
    }
}
