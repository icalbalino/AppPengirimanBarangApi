package com.sister.pengirimanbarangapi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "tb11_pengiriman")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pengiriman implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_registrasi;
    
    @OneToOne
    @JoinColumn(name = "id_paket", referencedColumnName = "id_paket", nullable = false)
    private Paket paket;
    
    @OneToOne
    @JoinColumn(name = "id_pengirim", referencedColumnName = "id_pengirim", nullable = false)
    private Pengirim pengirim;
    
    @OneToOne
    @JoinColumn(name = "id_petugas", referencedColumnName = "id_petugas", nullable = false)
    private Petugas petugas;
    
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date tanggal = new Date();
    
    @Column
    private String nama_penerima;
    @Column
    private String no_telepon;
    @Column
    private String alamat;
    @Column
    private String kota;
    @Column
    private String provinsi;
    @Column
    private Integer kode_pos;
    @Column
    private String isi_paket;
    @Column
    private Integer berat_paket;
    @Column
    private Integer total_harga;
    
}
