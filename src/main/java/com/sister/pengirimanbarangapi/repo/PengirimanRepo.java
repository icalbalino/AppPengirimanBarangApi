package com.sister.pengirimanbarangapi.repo;

import com.sister.pengirimanbarangapi.entity.Pengiriman;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PengirimanRepo extends JpaRepository<Pengiriman, Integer> {
    
    @Query("SELECT p FROM Pengiriman p WHERE p.id_registrasi = :id_registrasi")
    public List<Pengiriman> findAllById(@PathParam("id_registrasi") Integer id_registrasi);
    
    @Query("SELECT p FROM Pengiriman p WHERE p.nama_penerima LIKE :nama_penerima AND p.alamat LIKE :alamat")
    public List<Pengiriman> findByNamaPenerima(
            @PathParam("nama_penerima") String nama_penerima,
            @PathParam("alamat") String alamat
    );
    
    @Query("SELECT p FROM Pengiriman p WHERE p.nama_penerima LIKE :nama_penerima AND p.alamat LIKE :alamat")
    public List<Pengiriman> findByNamaPenerima1(
            @PathParam("nama_penerima") String nama_penerima,
            @PathParam("alamat") String alamat
    );

}