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
public class dokter {
    private String namaDokter;
    private String alamatDokter;

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getAlamatDokter() {
        return alamatDokter;
    }

    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    public void cetakDokter() {
        System.out.println("\nNama Dokter:" + this.namaDokter);
        System.out.println("Alamat Dokter:" + this.alamatDokter);
    }
    /*
    private String nama;
    private String alamat;
    private pasien pasien; //komposisi dengan relasi has-a

    public dokter() {
        this.nama = "Dr. Linda Agustina";
        this.alamat = "Yogyakarta";
        this.pasien = new pasien();
        pasien.setNama("Handoyo");
        pasien.setAlamat("Sleman");
        pasien.setNoRM(1234);
    }

    public void cetakDokter() {
        System.out.println("Nama Dokter:" + this.nama);
        System.out.println("Alamat :" + this.alamat);
        pasien.cetakPasien();
    }
*/
}
