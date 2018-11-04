package com.serildawn.remidiQuiz1;

/**
 *
 * @author Serildawn
 */
public class Pembeli 
{
    public String nama, alamat;
    public Jam jm[];
    
    public void hitungHargaTotal()
    {
        int total = 0;
        for(int i = 0; i < jm.length; i++)
        {
            total = total + jm[i].getHarga();
        }
        System.out.println("Harga Total\t: Rp" + total);
    }
    public void print ()
    {
        System.out.println("Nama Pembeli \t:" + nama);
        System.out.println("Alamat \t\t:" + alamat);
        for (int i =0; i < jm.length; i++)
        {
            jm[i].print();
        }
        System.out.println("----------------------------");
        hitungHargaTotal();
    }
}
