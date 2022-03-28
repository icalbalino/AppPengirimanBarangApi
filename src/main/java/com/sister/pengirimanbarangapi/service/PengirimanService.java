package com.sister.pengirimanbarangapi.service;

import com.sister.pengirimanbarangapi.entity.Pengiriman;
import com.sister.pengirimanbarangapi.repo.PengirimanRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
        
    public List<Pengiriman> findByNamaPenerima(String nama_penerima, String alamat) {
        return repo.findByNamaPenerima(nama_penerima, alamat);
    }
    
    public List<Pengiriman> findByNamaPenerima1(String nama_penerima, String alamat) throws Exception {
        try {
            return repo.findByNamaPenerima1(nama_penerima, alamat);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Pengiriman save(Pengiriman pengiriman) {
        return repo.save(pengiriman);
    }
    
    public void deleteById(Integer id_registrasi) {
        repo.deleteById(id_registrasi);
    }
    
}