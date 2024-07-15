package com.sistemi.informativi.profilo.controller;

import com.sistemi.informativi.profilo.entity.Address;
import com.sistemi.informativi.profilo.entity.Profile;
import com.sistemi.informativi.profilo.service.AddressService;
import com.sistemi.informativi.profilo.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/profile")
public class ProfileController {

    AddressService addressService;
    ProfileService profileService;

    public ProfileController(AddressService addressService, ProfileService profileService) {
        this.addressService = addressService;
        this.profileService = profileService;
    }

    @GetMapping
    public List<Address> getAddressesById(int id){
        return addressService.getAddressesById(id);
    }

    @PutMapping
    public Profile UpdateProfile(Profile profile){

        return profileService.saveOrUpdateProfile(profile);
    }

    @GetMapping("/id/{id}")
    public Profile getProfileById(@PathVariable int id){

        return profileService.getProfileById(id);

    }

    @DeleteMapping("/id/{id}")
    public Map<Integer, Boolean> removeProfileById(@PathVariable int id){

        return profileService.removeProfileById(id);

    }

    @GetMapping("/id/{id}")
    public int getPriorityLevel(@PathVariable int id){
        return profileService.priorityLevel(id);
    }
}
