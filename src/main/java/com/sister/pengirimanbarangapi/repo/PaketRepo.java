package com.sister.pengirimanbarangapi.repo;

import com.sister.pengirimanbarangapi.entity.Paket;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaketRepo extends JpaRepository<Paket, Integer> {
    
    @Query("SELECT p FROM Paket p WHERE p.id_paket = :id_paket")
    public List<Paket> findAllById(@PathParam("id_paket") Integer id_paket);
    
}
