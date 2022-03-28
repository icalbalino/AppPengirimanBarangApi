package com.sister.pengirimanbarangapi.service;

import com.sister.pengirimanbarangapi.entity.Paket;
import com.sister.pengirimanbarangapi.repo.PaketRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaketService {
    
    @Autowired
    PaketRepo repo;
    
    public List<Paket> findAll() {
        return repo.findAll();
    }
    
    public List<Paket> findAllById(Integer id_paket) {
        return repo.findAllById(id_paket);
    }
    
    public Paket save(Paket paket) {
        return repo.save(paket);
    }
    
    public void deleteById(Integer id_paket) {
        repo.deleteById(id_paket);
    }
    
}
