package com.sistemi.informarivi.informativi.facade;

import com.sistemi.informarivi.informativi.DTO.CustomerDTO;
import com.sistemi.informarivi.informativi.DTO.CustomerProductDTO;
import com.sistemi.informarivi.informativi.DTO.ProductDTO;
import com.sistemi.informarivi.informativi.VO.CustomerVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FacadeDAO {

    public Connection getConnection() throws SQLException, ClassNotFoundException;

    public  void closeConnection() throws SQLException, ClassNotFoundException;

    public int addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerVO> getNameCustomers(int id) throws SQLException, ClassNotFoundException;

    public int addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException;

    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws SQLException, ClassNotFoundException;
}
