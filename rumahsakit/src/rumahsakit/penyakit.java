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
public class penyakit {
    private String namaPenyakit;
    private String gejala;
    
    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public void cetakPenyakit() {
        System.out.println("\nNama Penyakit:" + this.namaPenyakit);
        System.out.println("Gejala :" + this.gejala);
    }
}
