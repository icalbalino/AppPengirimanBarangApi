/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.pengirimanbarangapi.controller;

import com.sister.pengirimanbarangapi.dto.GeneralResponse;
import com.sister.pengirimanbarangapi.dto.SearchIdDTO;
import com.sister.pengirimanbarangapi.entity.Pengiriman;
import com.sister.pengirimanbarangapi.service.PengirimanService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    
    @PostMapping("/findbynamapenerima1")
    public ResponseEntity<GeneralResponse> findByNamaPenerima1(@RequestBody SearchIdDTO search) {
        GeneralResponse<List<Pengiriman>> response = new GeneralResponse<>();
        response.setMessages(new ArrayList<String>());
        if(search.getNama_penerima().equals("") || search.getAlamat().equals("")){
            response.setStatus(false);
            response.getMessages().add("nama_penerima and alamat are required");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } else {
            try {
                response.setStatus(true);
                response.getMessages().add("Data is found");
                response.setData(service.findByNamaPenerima1("%" + search.getNama_penerima() + "%", 
                        "%" + search.getAlamat() + "%"));
                return ResponseEntity.status(HttpStatus.OK).body(response);
            } catch (Exception e) {
                response.setStatus(false);
                response.setMessages(new ArrayList<String>());
                response.getMessages().add(e.getMessage());
                
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
            }
        }
    }
    
    @GetMapping("/gettime")
    public String getDateAndTime() {
        return new Date().toString();
    }
    
}
