package com.sistemi.informativi.service;

import com.sistemi.informativi.repository.CustomerProductRepository;
import com.sistemi.informativi.entity.Customer;
import com.sistemi.informativi.entity.Product;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CustomerProductServiceImpl implements CustomerProductService {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${add.success.message}")
    private String addSuccessMessage;

    @Value("${add.error.message}")
    private String addErrorMessage;

    private CustomerProductRepository customerProductRepository;

    public CustomerProductServiceImpl(CustomerProductRepository customerProductRepository) {
        this.customerProductRepository = customerProductRepository;
    }

    @Override
    public void checkAddCutomer(Customer customer) {
        try {

            customerProductRepository.addCustomer(customer);
            log.info(addSuccessMessage);

        }

        catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

            log.info(addErrorMessage);
            ex.printStackTrace();

        }
    }

    @Override
    public void checkAddProduct(Product product) {
        try {

            customerProductRepository.addProduct(product);
            log.info(addSuccessMessage);

        }

        catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

            log.info(addErrorMessage);
            ex.printStackTrace();

        }

    }

    @Override
    public void checkGetCustomerByProduct(int id) {

        try{
            List<Customer> customers = customerProductRepository.getCustomersByProduct(id);
            if(!customers.isEmpty()){
                customers.forEach(review->log.info(review.toString()));
            }else
                throw new NullPointerException();
        }catch (NullPointerException ex){
            log.info(addErrorMessage);
            ex.printStackTrace();
        }

    }
}