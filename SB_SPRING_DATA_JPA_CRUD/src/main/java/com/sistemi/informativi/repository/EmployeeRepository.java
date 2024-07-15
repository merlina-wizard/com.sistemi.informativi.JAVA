package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Emplyee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Emplyee, String> {

    public List<Emplyee> findByLastName(String lastName);

    public List<Emplyee> findByExperienceYears(String firstName);
}
