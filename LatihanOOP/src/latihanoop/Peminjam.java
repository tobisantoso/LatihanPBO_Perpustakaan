package latihanoop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yudiwbs & masayu on 11/04/2017.
 * method yg harus dilengkapi: 5 : Peminjam(int id, String nama), jumlahBukuPinjam(), pinjam(Buku b),kembali(Buku b), print() 
 */

public class Peminjam {
    int id;
    String nama;
    private ArrayList<Buku> bukuPinjam = new ArrayList<>();

    //lengkapi constructor
    public Peminjam(int id, String nama) {
        this.id      =   id;
        this.nama    =   nama;
    }

    //lengkapi
    //mengembalikan total buku yang dipinjam
    public int jumlahBukuPinjam() {
        return this.bukuPinjam.size();
    }

    //lengkapi
    //tambah buku yang dipinjam ke arraylist bukuPinjam
    public void pinjam(Buku b) {
        bukuPinjam.add(b);
    }

    //lengkapi
    //buang buku dari arrayList, gunakan ArrayList.remove
    public void kembali(Buku b) {
         this.bukuPinjam.remove(b);
    }

    //lengkapi
    //print identitas dan buku yg dipinjam
    public void print() {
      System.out.println("id:" + this.id);
      System.out.println("nama: "+ this.nama);
      System.out.println("Buku yang dipinjam:");
        for (Iterator<Buku> iterator = bukuPinjam.iterator(); iterator.hasNext();) {
            Buku next = iterator.next();
            next.print();
            
        }
        System.out.println("Jumlah buku yang dipinjam : "+this.jumlahBukuPinjam());
    }

    //jangan edit
    /*
output yg harus dihasilkan:
id:123
nama:Fulan
Buku yang dipinjam:
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:2
Judul buku:Uang logam menggelinding
== Info Pengarang ==
id &  nama pengarang: (2) Elfan
==Info Buku==
id buku:3
Judul buku:Makan nasi dengan lauk
Jumlah buku yg dipinjam:2
Jumlah buku yg dipinjam:2

Kembalikan buku dengan id 2
id:123
nama:Fulan
Buku yang dipinjam:
== Info Pengarang ==
id &  nama pengarang: (2) Elfan
==Info Buku==
id buku:3
Judul buku:Makan nasi dengan lauk
Jumlah buku yg dipinjam:1

     */
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        perpus.loadBuku();

        Peminjam p = new Peminjam(123, "Fulan");

        //pinjam dua buku
        Buku bPinjam2 = perpus.cariBukuDenganId(2);
        p.pinjam(bPinjam2);
        Buku bPinjam3 = perpus.cariBukuDenganId(3);
        p.pinjam(bPinjam3);
        p.print();
        System.out.println("Jumlah buku yg dipinjam:"+p.jumlahBukuPinjam());

        //mengembalikan buku id 3
        System.out.println("");
        System.out.println("Kembalikan buku dengan id 2");
        p.kembali(bPinjam2);
        p.print();


    }
}
