package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionManager implements DbParameters{

    private static Connection con;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(con==null){
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        }
        return con;
    }

    public static PreparedStatement getPreperedStatement(String sql) throws SQLException {
        PreparedStatement ps = con.prepareStatement(sql);
        return ps;
    }

    public void closeConnection() throws SQLException, ClassNotFoundException {
        getConnection().close();
    }
}
