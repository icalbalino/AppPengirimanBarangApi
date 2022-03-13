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
@Table(name = "tb14_petugas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Petugas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_petugas;
    @Column
    private String nama_petugas;
    @Column
    private String no_telepon;
    @Column
    private String alamat;
    @Column
    private String daerah_tugas;
    @Column
    private String jabatan;
    
}
