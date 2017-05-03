/**
 * Created by yudiwbs & masayu on 11/04/2017.
 *
 * method yg harus dilengkapi: 2 : Pengarang(int id, String nama), print()
 */

package latihanoop;

public class Pengarang {
    int id;
    String nama;

    //lengkapi constructor
    public Pengarang(int id, String nama) {
        this.id     = id;
        this.nama   = nama;
    }

    //lengkapi 
    public void print() {
      System.out.println("== Info Pengarang ==");
      System.out.println("id & nama pengarang: (" + this.id +")  " + this.nama);
    }

    //jangan edit
    /*
    output yg harus dihasilkan:

== Info Pengarang ==
id &  nama pengarang: (1) Ahmad

     */
    public static void main(String[] args) {
        //test
        Pengarang ahmad = new Pengarang(1,"Ahmad");
        ahmad.print();
    }
}
