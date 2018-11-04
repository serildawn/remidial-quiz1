package com.serildawn.remidiQuiz1;

/**
 *
 * @author Serildawn
 */
public class Member extends Pembeli
{
    public void hitungHargaTotal()
    {
        double total = 0;
        for(int i=0; i < jm.length; i++)
        {
            total = total + jm[i].getHarga();
        }
        total = total - (0.05*total);
        System.out.println("Harga Total \t: Rp" + total);
    }
}
