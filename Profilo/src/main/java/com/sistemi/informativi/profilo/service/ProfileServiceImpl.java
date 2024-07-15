package com.sistemi.informativi.profilo.service;

import com.sistemi.informativi.profilo.entity.Address;
import com.sistemi.informativi.profilo.entity.Profile;
import com.sistemi.informativi.profilo.repository.ProfileRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProfileServiceImpl implements ProfileService {

    public ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile saveOrUpdateProfile(Profile profile) {
        try{
            profileRepository.save(profile);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return profile;
    }

    @Override
    public Profile getProfileById(int id) {

        return profileRepository.findById(id).orElseThrow(()->new EntityNotFoundException("error get profile by id"));
    }

    @Override
    public Map<Integer, Boolean> removeProfileById(int id) {
        try {
            profileRepository.deleteById(id);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(id, true);
        return map;
    }


    @Override
    public int priorityLevel (int id) {
        return profileRepository.findById(id).get().getPriorityLevel();
    }
}
