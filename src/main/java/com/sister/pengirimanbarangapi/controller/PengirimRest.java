package com.sister.pengirimanbarangapi.controller;

import com.sister.pengirimanbarangapi.dto.SearchIdDTO;
import com.sister.pengirimanbarangapi.entity.Pengirim;
import com.sister.pengirimanbarangapi.service.PengirimService;
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
@RequestMapping("/api/pengirim")
public class PengirimRest {
    
    @Autowired
    PengirimService service;
    
    @GetMapping("/findall")
    public List<Pengirim> findAll() {
        return service.findAll();
    }
    
    @GetMapping("/findallbyid")
    public List<Pengirim> findAllById(@RequestBody SearchIdDTO search) {
        return service.findAllById(search.getId_pengirim());
    }
    
    @PostMapping("/insertone")
    public Pengirim insertPaket(@RequestBody Pengirim pengirim){
        return service.save(pengirim);
    }
    
    @PutMapping("/updatebyid")
    public Pengirim updateById(@RequestBody Pengirim pengirim) {
        return service.save(pengirim);
    }
    
    @DeleteMapping("/deletebyid")
    public void deleteById(@RequestBody SearchIdDTO search){
        service.deleteById(search.getId_pengirim());
    }
    
}