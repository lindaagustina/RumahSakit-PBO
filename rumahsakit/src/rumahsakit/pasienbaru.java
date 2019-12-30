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
public class pasienbaru extends pasien{
    public pasienbaru(String namaPasien, String alamatPasien){
        super();
    }
    public void registrasi(){
        super. namaPasien = namaPasien;
        super. alamatPasien = alamatPasien;
    }
    
    @Override
    public void cetakPasien() {
        super.cetakPasien();
        System.out.println("Pasien berhasil diregistrasi");
    }
}
