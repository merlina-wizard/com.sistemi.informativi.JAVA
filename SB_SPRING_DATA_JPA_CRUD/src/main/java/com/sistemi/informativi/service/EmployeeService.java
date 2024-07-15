package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Emplyee;

import java.util.List;

public interface EmployeeService {

    public void saveOrUpdateEmployee(Emplyee employee);
    public void deleteEmployee(String id);
    public void getEmployeeById(String id);
    public void getEmployeeByLastName(String lastName);
    public void getEmployeeByExperienceGraterThan(String experience);
}
