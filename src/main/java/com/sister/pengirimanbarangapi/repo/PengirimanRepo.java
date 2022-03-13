/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.pengirimanbarangapi.repo;

import com.sister.pengirimanbarangapi.entity.Pengiriman;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface PengirimanRepo extends JpaRepository<Pengiriman, Integer> {
    
    @Query("SELECT p FROM Pengiriman p WHERE p.id_registrasi = :id_registrasi")
    public List<Pengiriman> findAllById(@PathParam("id_registrasi") Integer id_registrasi);

}