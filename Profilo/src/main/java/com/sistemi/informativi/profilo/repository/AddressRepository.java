package com.sistemi.informativi.profilo.repository;

import com.sistemi.informativi.profilo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    public List<Address> findByProfileId(Integer id);
}
