/**
 * Created by yudiwbs & masayu on 11/04/2017
 * method yang harus dilengkapi: 2 : Buku(Pengarang p, int idBuku, String judul), print()
 */

package latihanoop;

public class Buku {
    int id;
    String judul;
    Pengarang pengarang;

    //lengkapi constrcutor
    public Buku(Pengarang p, int idBuku, String judul) {
        this.id          =   idBuku;
        this.judul  =   judul;
        this.pengarang   =   p;
    }

    //lengkapi
    public void print() {
      
      System.out.println("== Info Pengarang ==\n"+"("+this.pengarang.id+") "+this.pengarang.nama);
      System.out.println("==Info Buku==\nid Buku:" + this.id+"\n"+"Judul buku:"+this.judul);
    }


    //jangan edit
    /*
    output yang harus dihasilkan:

== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:1
Judul buku:Diatas langit ada langit

     */
    public static void main(String[] args) {
        Pengarang ahmad = new Pengarang(1,"Ahmad");
        Buku b = new Buku(ahmad,1,"Diatas langit ada langit");
        b.print();
    }
}
