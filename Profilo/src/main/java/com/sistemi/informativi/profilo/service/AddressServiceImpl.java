package com.sistemi.informativi.profilo.service;

import com.sistemi.informativi.profilo.entity.Address;
import com.sistemi.informativi.profilo.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAddressesById(int id) {

        List<Address> address = new ArrayList<>();
        try{
            address = addressRepository.findByProfileId(id);
            }
        catch(Exception e){
            e.printStackTrace();
        }
        return address;
    }

}
