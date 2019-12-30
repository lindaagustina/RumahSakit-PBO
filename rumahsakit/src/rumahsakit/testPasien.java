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
public class testPasien {
    public static void main(String args[]){
        pasienlama pas1 = new pasienlama();
        pas1.cetakNoKartu();
        pasienbaru pas2 = new pasienbaru("Linda", "Sleman");
        pas2.cetakPasien();
    }
}
