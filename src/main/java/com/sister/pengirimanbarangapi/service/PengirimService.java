package com.sister.pengirimanbarangapi.service;

import com.sister.pengirimanbarangapi.entity.Pengirim;
import com.sister.pengirimanbarangapi.repo.PengirimRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PengirimService {
    
    @Autowired
    PengirimRepo repo;
    
    public List<Pengirim> findAll() {
        return repo.findAll();
    }
    
    public List<Pengirim> findAllById(Integer id_pengirim) {
        return repo.findAllById(id_pengirim);
    }
    
    public Pengirim save(Pengirim pengirim) {
        return repo.save(pengirim);
    }
    
    public void deleteById(Integer id_pengirim) {
        repo.deleteById(id_pengirim);
    }
    
}