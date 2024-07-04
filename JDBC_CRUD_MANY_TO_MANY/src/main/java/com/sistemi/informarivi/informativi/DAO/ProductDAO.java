package com.sistemi.informarivi.informativi.DAO;

import com.sistemi.informarivi.informativi.DTO.ProductDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {

    public int addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException;

}
