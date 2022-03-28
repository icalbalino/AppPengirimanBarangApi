package com.sister.pengirimanbarangapi.dto;

import java.util.Date;
import lombok.Data;


@Data
public class SearchIdDTO {
    
    private Integer id_registrasi;
    private Integer id_paket;
    private Integer id_pengirim;
    private Integer id_petugas;
    private Date tanggal;
    private String nama_penerima;
    private String no_telepon;
    private String alamat;
    private String kota;
    private String provinsi;
    private Integer kode_pos;
    private String isi_paket;
    private Integer berat_paket;
    private Integer total_harga;
    
}