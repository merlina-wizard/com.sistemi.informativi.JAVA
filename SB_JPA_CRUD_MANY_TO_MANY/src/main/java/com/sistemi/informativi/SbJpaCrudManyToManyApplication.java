package com.sistemi.informativi;

import com.sistemi.informativi.entity.Product;
import com.sistemi.informativi.service.CustomerProductService;
import com.sistemi.informativi.entity.Customer;
import com.sistemi.informativi.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SbJpaCrudManyToManyApplication implements CommandLineRunner {

    private CustomerProductService customerProductService;

   public SbJpaCrudManyToManyApplication(CustomerProductService customerProductService) {
       this.customerProductService = customerProductService;
   }
    @Override
    public void run(String... args) throws Exception {


        Customer customer = new Customer("John", "Smith");
        Customer customer1 = new Customer("Jane", "Doe");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer1);
        System.out.println(customer);
        Product product = new Product("PC", 123.2F);
        Product product1 = new Product("MAC", 123.222F);
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        customer1.setProducts(products);
        customer.setProducts(products);

        product1.setCustomers(customers);
        product.setCustomers(customers);

        customerProductService.checkAddCutomer(customer);
        customerProductService.checkAddCutomer(customer1);
        customerProductService.checkAddProduct(product);
        customerProductService.checkAddProduct(product1);
        customerProductService.checkGetCustomerByProduct(1);
    }

    public static void main(String[] args) {
        SpringApplication.run(SbJpaCrudManyToManyApplication.class, args);
    }

}
