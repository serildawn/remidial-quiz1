package com.serildawn.remidiQuiz1;

/**
 *
 * @author Serildawn
 */
public class Main 
{
    public static void main(String []args)
    {
        Jam j1 = new Jam("Fossil", 1250000);
        Jam j2 = new Jam("Guess", 1500000);
        
        Jam j[] = {j1,j2};
        Pembeli p1 = new Pembeli();
        p1.nama = "Serilda";
        p1.alamat = "Jalan suhat";
        p1.jm= j;
        
        p1.print();;
        
        System.out.println("");
        
        Member m1 = new Member();
        m1.nama = "Wahyu";
        m1.alamat = "Jalan wikarsa";
        m1.jm = j;
        
        m1.print();
                
    }
}
