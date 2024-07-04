package com.sistemi.informarivi.informativi.DAO;


import com.sistemi.informarivi.informativi.DTO.ProductDTO;
import com.sistemi.informarivi.informativi.connection.ConnectionManager;
import com.sistemi.informarivi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {


    @Override
    public int addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException {

        int id = -1;
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlProductInsert);
        ps.setString(1, productDTO.getName());
        ps.setFloat(2, productDTO.getPrice());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            id = rs.getInt(1);
        }
        System.out.println(id);
        return id;
    }

}
