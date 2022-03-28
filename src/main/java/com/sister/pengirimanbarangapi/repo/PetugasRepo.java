package com.sister.pengirimanbarangapi.repo;

import com.sister.pengirimanbarangapi.entity.Petugas;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PetugasRepo extends JpaRepository<Petugas, Integer> {
    
    @Query("SELECT p FROM Petugas p WHERE p.id_petugas = :id_petugas")
    public List<Petugas> findAllById(@PathParam("id_petugas") Integer id_petugas);
    
}