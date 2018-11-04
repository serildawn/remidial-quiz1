
package com.serildawn.remidiQuiz1;

/**
 *
 * @author Serildawn
 */
public class Jam 
{
    private String merk;
    private int harga;

    public Jam(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void print ()
    {
        System.out.println("---------------------------");
        System.out.println("Merk jam \t:"+ merk);
        System.out.println("Harga \t\t: Rp" + harga);
    }
    
}
