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
public class pasienlama extends pasien{
    private int noKartu;
    
    public int getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(int noKartu) {
        this.noKartu = noKartu;
    }
    
    public void cetakNoKartu() {
        System.out.println("\nNo Kartu:" + this.noKartu);
    }
}
