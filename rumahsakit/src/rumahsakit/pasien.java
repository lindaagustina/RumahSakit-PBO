/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author bsi07
 */
public class pasien {
    String namaPasien;
    String alamatPasien;
    int noRM;
    private dokter dokter; 
    private obat obat;
    private penyakit penyakit;
   // private pasienlama pasienlama;

    public pasien() {
        this.namaPasien = "Supri";
        this.alamatPasien = "Yogyakarta";
        this.noRM = 1234;
        
        this.dokter = new dokter();
        dokter.setNamaDokter("Dr. Linda Agustina");
        dokter.setAlamatDokter("Sleman");
        
        this.obat = new obat();
        obat.setNamaObat("Paracetamol");
        obat.setIdObat("PR0123");
        
        this.penyakit = new penyakit();
        penyakit.setNamaPenyakit("Panas Dingin");
        penyakit.setGejala("Panas Dingin, Sakit Hati");
        
    //    this.pasienlama = new pasienlama();
     //   pasienlama.setNoKartu(566);
    }

    public void cetakPasien() {
        
        System.out.println("Nama Pasien:" + this.namaPasien);
        System.out.println("Alamat Pasien :" + this.alamatPasien);
        penyakit.cetakPenyakit();
        obat.cetakObat();
        dokter.cetakDokter();
      //  pasienlama.cetakNoKartu();
    }
}
