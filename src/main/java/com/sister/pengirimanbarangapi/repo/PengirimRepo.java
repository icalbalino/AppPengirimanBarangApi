package com.sister.pengirimanbarangapi.repo;

import com.sister.pengirimanbarangapi.entity.Pengirim;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PengirimRepo extends JpaRepository<Pengirim, Integer> {
    
    @Query("SELECT p FROM Pengirim p WHERE p.id_pengirim = :id_pengirim")
    public List<Pengirim> findAllById(@PathParam("id_pengirim") Integer id_pengirim);
    
}