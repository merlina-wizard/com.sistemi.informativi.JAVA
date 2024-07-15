package com.sistemi.informativi.profilo.service;

import com.sistemi.informativi.profilo.entity.Address;

import java.util.List;

public interface AddressService {

    public List<Address> getAddressesById(int id);
}
