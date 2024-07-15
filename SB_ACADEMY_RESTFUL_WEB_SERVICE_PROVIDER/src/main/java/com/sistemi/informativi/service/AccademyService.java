package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Accademy;

import java.util.List;
import java.util.Map;

public interface AccademyService {


    public List<Accademy> getAccademy();

    public Accademy getAccademyByCode(String id);

    public Accademy saveOrUpdateAccademy(Accademy accademy);

    public Map<String, Boolean> removeAccademy(String code);


}
