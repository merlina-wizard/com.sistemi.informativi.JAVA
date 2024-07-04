package com.sistemi.informarivi.informativi.main;



import com.sistemi.informarivi.informativi.DTO.CustomerDTO;
import com.sistemi.informarivi.informativi.DTO.CustomerProductDTO;
import com.sistemi.informarivi.informativi.DTO.ProductDTO;
import com.sistemi.informarivi.informativi.facade.FacadeDAO;
import com.sistemi.informarivi.informativi.facade.FacadeDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        FacadeDAO facadeDAO = new FacadeDAOImpl();


        Connection con = facadeDAO.getConnection();

        int idCustomer =facadeDAO.addCustomer(new CustomerDTO("Pinocchio", "pino@gmail.com"));
        int idPrudoct= facadeDAO.addProduct(new ProductDTO("Balocchi", 123));
        facadeDAO.addCustomerProduct(new CustomerProductDTO(idCustomer, idPrudoct));

        facadeDAO.getNameCustomers(idPrudoct).forEach(System.out::println);




        /*
        int id = facadeDAO.addCourse(new CourseDTO("React"));
        facadeDAO.addReview(new ReviewDTO("Florence", id));
        facadeDAO.addReview(new ReviewDTO("Tinbuktu", id));
        facadeDAO.addReview(new ReviewDTO("Honululu", id));

        facadeDAO.getReviewsLocation(id).forEach(System.out::println);

        id = facadeDAO.addCourse(new CourseDTO("Corso3"));
        facadeDAO.addReview(new ReviewDTO("Malaga", id));
        facadeDAO.addReview(new ReviewDTO("Parigi", id));
        facadeDAO.getReviewsLocation(id).forEach(System.out::println);
         */

        facadeDAO.closeConnection();

    }
}