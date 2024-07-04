package com.sistemi.informarivi.informativi.facade;



import com.sistemi.informarivi.informativi.DAO.*;
import com.sistemi.informarivi.informativi.DTO.CustomerDTO;
import com.sistemi.informarivi.informativi.DTO.CustomerProductDTO;
import com.sistemi.informarivi.informativi.DTO.ProductDTO;
import com.sistemi.informarivi.informativi.VO.CustomerVO;
import com.sistemi.informarivi.informativi.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FacadeDAOImpl implements FacadeDAO {

    CustomerDAO customerDAO = new CustomerDAOImpl();
    ProductDAO productDAO = new ProductDAOImpl();
    CustomerProductDAO customerProductDAO = new CustomerProductDAOImpl();


    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        return ConnectionManager.getConnection();
    }

    @Override
    public void closeConnection() throws SQLException, ClassNotFoundException {
        ConnectionManager.closeConnection();
    }

    @Override
    public int addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return customerDAO.addCustomer(customerDTO);
    }

    @Override
    public ArrayList<CustomerVO> getNameCustomers(int id) throws SQLException, ClassNotFoundException {
       return customerDAO.getNameCustomers(id);
    }

    @Override
    public int addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException {

        return productDAO.addProduct(productDTO);

    }

    @Override
    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws SQLException, ClassNotFoundException {

        customerProductDAO.addCustomerProduct(customerProductDTO);
    }
}
