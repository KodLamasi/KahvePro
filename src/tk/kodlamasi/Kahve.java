/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi;

/**
 *
 * @author beyyine
 */
public class Kahve {
    private String kahve_Adi;
    private int seker_sayisi;

    public Kahve(String kahve_Adi, int seker_sayisi) {
        this.kahve_Adi = kahve_Adi;
        this.seker_sayisi = seker_sayisi;
    }

    public String getKahve_Adi() {
        return kahve_Adi;
    }

    public void setKahve_Adi(String kahve_Adi) {
        this.kahve_Adi = kahve_Adi;
    }

    public int getSeker_sayisi() {
        return seker_sayisi;
    }

    public void setSeker_sayisi(int seker_sayisi) {
        this.seker_sayisi = seker_sayisi;
    }
    
    
    
}
