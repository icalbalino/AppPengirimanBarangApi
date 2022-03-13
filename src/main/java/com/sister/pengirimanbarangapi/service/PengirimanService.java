/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.pengirimanbarangapi.service;

import com.sister.pengirimanbarangapi.entity.Pengiriman;
import com.sister.pengirimanbarangapi.repo.PengirimanRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PengirimanService {
    
    @Autowired
    PengirimanRepo repo;
    
    public List<Pengiriman> findAll() {
        return repo.findAll();
    }
    
    public List<Pengiriman> findAllById(Integer id_registrasi) {
        return repo.findAllById(id_registrasi);
    }
    
}
