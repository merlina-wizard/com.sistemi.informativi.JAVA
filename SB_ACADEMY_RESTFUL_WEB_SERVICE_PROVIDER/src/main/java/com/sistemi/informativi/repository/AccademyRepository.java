package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Accademy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccademyRepository extends JpaRepository<Accademy, String> {

}
