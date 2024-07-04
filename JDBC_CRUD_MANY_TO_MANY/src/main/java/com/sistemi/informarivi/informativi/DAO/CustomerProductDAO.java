package com.sistemi.informarivi.informativi.DAO;

import com.sistemi.informarivi.informativi.DTO.CustomerProductDTO;

import java.sql.SQLException;

public interface CustomerProductDAO {

    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws SQLException, ClassNotFoundException;
}
