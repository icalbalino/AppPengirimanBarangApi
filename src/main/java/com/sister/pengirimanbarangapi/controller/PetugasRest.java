package com.sister.pengirimanbarangapi.controller;

import com.sister.pengirimanbarangapi.dto.SearchIdDTO;
import com.sister.pengirimanbarangapi.entity.Petugas;
import com.sister.pengirimanbarangapi.service.PetugasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/petugas")
public class PetugasRest {
    
    @Autowired
    PetugasService service;
    
    @GetMapping("/findall")
    public List<Petugas> findAll() {
        return service.findAll();
    }
    
    @GetMapping("/findallbyid")
    public List<Petugas> findAllById(@RequestBody SearchIdDTO search) {
        return service.findAllById(search.getId_petugas());
    }
    
    @PostMapping("/insertone")
    public Petugas insertPaket(@RequestBody Petugas petugas){
        return service.save(petugas);
    }
    
    @PutMapping("/updatebyid")
    public Petugas updateById(@RequestBody Petugas petugas) {
        return service.save(petugas);
    }
    
    @DeleteMapping("/deletebyid")
    public void deleteById(@RequestBody SearchIdDTO search){
        service.deleteById(search.getId_petugas());
    }
        
}