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
public class obat {
    private String namaObat;
    private String idObat;

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getIdObat() {
        return idObat;
    }

    public void setIdObat(String idObat) {
        this.idObat = idObat;
    }

    public void cetakObat() {
        System.out.println("\nNama Obat:" + this.namaObat);
        System.out.println("Id Obat:" + this.idObat);
    }
}
