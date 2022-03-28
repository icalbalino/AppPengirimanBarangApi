package com.sister.pengirimanbarangapi.service;

import com.sister.pengirimanbarangapi.entity.Petugas;
import com.sister.pengirimanbarangapi.repo.PetugasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PetugasService {
    
    @Autowired
    PetugasRepo repo;
    
    public List<Petugas> findAll() {
        return repo.findAll();
    }
    
    public List<Petugas> findAllById(Integer id_petugas) {
        return repo.findAllById(id_petugas);
    }
    
    public Petugas save(Petugas petugas) {
        return repo.save(petugas);
    }
    
    public void deleteById(Integer id_petugas) {
        repo.deleteById(id_petugas);
    }
    
}