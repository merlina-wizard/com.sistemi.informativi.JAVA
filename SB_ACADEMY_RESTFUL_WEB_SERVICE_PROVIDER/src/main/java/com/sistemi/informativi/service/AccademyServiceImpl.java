package com.sistemi.informativi.service;


import com.sistemi.informativi.entity.Accademy;
import com.sistemi.informativi.repository.AccademyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class AccademyServiceImpl implements AccademyService{

    private AccademyRepository accademyRepository;

    public AccademyServiceImpl(AccademyRepository accademyRepository) {
        this.accademyRepository = accademyRepository;
    }

    @Override
    public List<Accademy> getAccademy() {

            List<Accademy> accademy = new ArrayList<>();
        try {
            accademy = accademyRepository.findAll();
        }
       catch (Exception ex){
            ex.printStackTrace();
        }
        return accademy;
    }

    @Override
    public Accademy getAccademyByCode(String id) {

        return accademyRepository.findById(id).orElseThrow(()->new EntityNotFoundException("error getAccademyByCode"));
    }

    @Override
    public Accademy saveOrUpdateAccademy(Accademy accademy) {
        try {
        accademyRepository.save(accademy);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return accademy;
    }

    @Override
    public Map<String, Boolean> removeAccademy(String code) {


        try {
            accademyRepository.deleteById(code);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        Map<String, Boolean> map = new HashMap<>();
        map.put("elimination", true);
        return map;

    }
}
