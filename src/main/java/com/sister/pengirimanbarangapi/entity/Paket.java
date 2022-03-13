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
@Table(name = "tb12_paket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paket implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_paket;
    @Column
    private String tipe_paket;
    @Column
    private Integer asuransi_paket;
    @Column
    private Integer harga_paket;

}
