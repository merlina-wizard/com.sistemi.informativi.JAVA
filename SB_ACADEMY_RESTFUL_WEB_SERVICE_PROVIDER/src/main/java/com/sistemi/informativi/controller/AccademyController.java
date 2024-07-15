package com.sistemi.informativi.controller;

import com.sistemi.informativi.entity.Accademy;
import com.sistemi.informativi.service.AccademyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/accademies")
public class AccademyController {
    private AccademyService accademyService;

    public AccademyController(AccademyService accademyService) {
        this.accademyService = accademyService;
    }

    @GetMapping
    public List<Accademy> findAll() {
       return accademyService.getAccademy();
    }

    @GetMapping("/code/{id}")
    public Accademy findById(@PathVariable String id) {
       return accademyService.getAccademyByCode(id);
    }

    @PostMapping
    public Accademy save(@RequestBody Accademy accademy) {
        return accademyService.saveOrUpdateAccademy(accademy);
    }

    @PutMapping
    public Accademy update(@RequestBody Accademy accademy) {
        return accademyService.saveOrUpdateAccademy(accademy);
    }

    @DeleteMapping("/code/{id}")
    public void delete(@PathVariable String id) {
        accademyService.removeAccademy(id);
    }
}
