/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanuang;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Bag2 {
    String Nama,Ni,K,A,Al,Kw; //
    int u,ut;                 //Deklarasi variabel
    Scanner I = new Scanner(System.in);//scanner
    
    void buka(){//method untuk menampilkan tampilan awal
        System.out.println("Selamat datang di agen peminjaman uang");
        System.out.println("           >>PROGRAM KHUSUS<<");
        System.out.println("Dapatkan bunga sebesar 2% selama setahun\ndengan minimal pinjaman sebesar Rp.0");
        System.out.println("Isi data berikut =>");
    }
    void data(){//method yang isinya digunakan untuk inputan user
        System.out.println("\nMasukkan data sesuai KTP");
        System.out.println("========================");
        System.out.print("Nama\t\t: ");
        Nama = I.nextLine();
        System.out.print("Nik\t\t: ");
        Ni = I.nextLine();
        System.out.print("Kelamin\t\t: ");
        K = I.nextLine();
        System.out.print("Alamat\t\t: ");
        Al = I.nextLine();
    }
    int itungan(){//method non void untuk mengembalikan nilaidari uang yang dimasukkan user
        System.out.print("Masukkan uang yang akan dipinjam\t\t: ");
        u = I.nextInt();
        return u;
    }
    int akhir(){//method non void perhitungan jumlah uang beserta bunga
        System.out.print("Uang yang harus dibayar dengan tempo satu tahun\t: ");
        ut = (2*u/100)+u;
        return ut;
    }
    void tutup(){//method void untuk menampilkan kalimat penutup
        System.out.println("\nTerimakasih atas kepercayaan anda");
        System.out.println(">>Jangan lupa bayar utang -_- <<");
    }
}
