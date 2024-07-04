package com.sistemi.informarivi.informativi.DAO;



import com.sistemi.informarivi.informativi.DTO.CustomerDTO;
import com.sistemi.informarivi.informativi.VO.CustomerVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {

    public int addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerVO> getNameCustomers(int id) throws SQLException, ClassNotFoundException;

}
