import com.sistemi.informarivi.facade.FacadeDAO;
import com.sistemi.informarivi.facade.FacadeDAOImpl;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class CrudTest {


    @Test
    public void removeCourseTest() throws SQLException, ClassNotFoundException {

        FacadeDAO facadeDAO = new FacadeDAOImpl();
        Connection con = facadeDAO.getConnection();
        facadeDAO.deleteCourse(6);
        facadeDAO.closeConnection();
    }
}
