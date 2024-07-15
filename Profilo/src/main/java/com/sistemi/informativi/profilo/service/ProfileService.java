package com.sistemi.informativi.profilo.service;

import com.sistemi.informativi.profilo.entity.Address;
import com.sistemi.informativi.profilo.entity.Profile;

import java.util.List;
import java.util.Map;

public interface ProfileService {

    public Profile saveOrUpdateProfile(Profile profile);

    public Profile getProfileById(int id);

    public Map<Integer, Boolean> removeProfileById(int id);

    public int priorityLevel(int id);
}
