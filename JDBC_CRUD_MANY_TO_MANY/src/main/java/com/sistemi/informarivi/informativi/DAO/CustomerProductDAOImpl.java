package com.sistemi.informarivi.informativi.DAO;

import com.sistemi.informarivi.informativi.DTO.CustomerProductDTO;
import com.sistemi.informarivi.informativi.VO.CustomerVO;
import com.sistemi.informarivi.informativi.connection.ConnectionManager;
import com.sistemi.informarivi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerProductDAOImpl implements CustomerProductDAO {


    @Override
    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws SQLException, ClassNotFoundException {

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlJoinInsert);
        ps.setInt(1,  customerProductDTO.getCustomerId());
        System.out.println(customerProductDTO.getCustomerId());
        ps.setInt(2, customerProductDTO.getProductId());
        System.out.println(customerProductDTO.getProductId());
        ps.executeUpdate();

    }
}
