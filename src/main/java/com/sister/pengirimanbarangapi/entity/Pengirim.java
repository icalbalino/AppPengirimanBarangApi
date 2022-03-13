package com.sister.pengirimanbarangapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb13_pengirim")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pengirim implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pengirim;
    @Column
    private String nama_pengirim;
    @Column
    private String no_telepon;
    @Column
    private String alamat;
    @Column
    private String daerah;
    @Column
    private String kota;
    @Column
    private String provinsi;
    @Column
    private Integer kode_pos;
    
}
