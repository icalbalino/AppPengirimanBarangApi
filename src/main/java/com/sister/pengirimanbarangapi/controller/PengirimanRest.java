/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.pengirimanbarangapi.controller;

import com.sister.pengirimanbarangapi.dto.SearchIdDTO;
import com.sister.pengirimanbarangapi.entity.Pengiriman;
import com.sister.pengirimanbarangapi.service.PengirimanService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/api/pengiriman")
public class PengirimanRest {
    
    @Autowired
    PengirimanService service;
    
    @GetMapping("/findall")
    public List<Pengiriman> findAll() {
        return service.findAll();
    }
    
    @PostMapping("/findallbyid")
    public List<Pengiriman> findAllById(@RequestBody SearchIdDTO search) {
        return service.findAllById(search.getId_registrasi());
    }
    
    @PostMapping("/findbynamapenerima")
    public List<Pengiriman> findByNamaPenerima(@RequestBody SearchIdDTO search) {
        return service.findByNamaPenerima("%" + search.getNama_penerima() + "%", "%" + search.getAlamat() + "%");
    }
    
    @GetMapping("/gettime")
    public String getDateAndTime() {
        return new Date().toString();
    }
    
}
