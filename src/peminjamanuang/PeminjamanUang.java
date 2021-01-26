/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanuang;

/**
 *
 * @author MOKLET-2
 */
public class PeminjamanUang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bag2 pinjem = new Bag2();//objek
        pinjem.buka();                      //pemanggilan method void
        pinjem.data();                      //pemanggilan method void
        pinjem.itungan();                   //pemanggilan method void
        System.out.println(pinjem.akhir()); //pemanggilan khusus method non void
        pinjem.tutup();                     //pemanggilan method void
    }
    
}
