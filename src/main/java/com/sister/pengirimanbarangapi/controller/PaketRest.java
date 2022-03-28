package com.sister.pengirimanbarangapi.controller;

import com.sister.pengirimanbarangapi.dto.SearchIdDTO;
import com.sister.pengirimanbarangapi.entity.Paket;
import com.sister.pengirimanbarangapi.service.PaketService;
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
@RequestMapping("/api/paket")
public class PaketRest {
    
    @Autowired
    PaketService service;
    
    @GetMapping("/findall")
    public List<Paket> findAll() {
        return service.findAll();
    }
    
    @GetMapping("/findallbyid")
    public List<Paket> findAllById(@RequestBody SearchIdDTO search) {
        return service.findAllById(search.getId_paket());
    }
    
    @PostMapping("/insertone")
    public Paket insertPaket(@RequestBody Paket paket){
        return service.save(paket);
    }
    
    @PutMapping("/updatebyid")
    public Paket updateById(@RequestBody Paket paket) {
        return service.save(paket);
    }
    
    @DeleteMapping("/deletebyid")
    public void deleteById(@RequestBody SearchIdDTO search){
        service.deleteById(search.getId_paket());
    }
    
}
