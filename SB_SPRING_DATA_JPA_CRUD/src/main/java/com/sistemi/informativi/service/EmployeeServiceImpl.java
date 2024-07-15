package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Emplyee;
import com.sistemi.informativi.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${add.update.success.message}")
    private String addUpdateSuccessMessage;

    @Value("${add.update.error.message}")
    private String addUpdateErrorMessage;

    @Value("${delete.success.message}")
    private String deleteSuccessMessage;

    @Value("${delete.error.message}")
    private String deleteErrorMessage;

    @Value("${get.error.message}")
    private String getErrorMessage;



    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveOrUpdateEmployee(Emplyee employee) {

        try {
            employeeRepository.save(employee);
            log.info(addUpdateSuccessMessage);
        }
        catch ( OptimisticLockingFailureException | IllegalArgumentException ex) {
            log.info(addUpdateErrorMessage);
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(String id) {

        try {
              employeeRepository.deleteById(id);
              log.info(deleteSuccessMessage);
        }
        catch ( OptimisticLockingFailureException | IllegalArgumentException ex) {
            log.info(deleteErrorMessage);
            ex.printStackTrace();
        }
    }

    @Override
    public void getEmployeeById(String id) {

        try {
            List<Emplyee> employees = employeeRepository.findAll();
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new IllegalArgumentException();
            }
        }catch (NullPointerException | IllegalArgumentException | OptimisticLockingFailureException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
    }

    @Override
    public void getEmployeeByLastName(String lastName) {

        try {
            List<Emplyee> employees = employeeRepository.findAll(lastName);
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new IllegalArgumentException();
            }
        }catch (NullPointerException | IllegalArgumentException | OptimisticLockingFailureException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }

    }

    @Override
    public void getEmployeeByExperienceGraterThan(String experience) {

        try {
            List<Emplyee> employees = employeeRepository.findByExperienceYears(experience);
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new IllegalArgumentException();
            }
        }catch (NullPointerException | IllegalArgumentException | OptimisticLockingFailureException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
    }
}
